package ru.almaz.security.details;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.almaz.models.State;
import ru.almaz.models.User;

import java.util.Collection;
import java.util.Collections;

public class UserDetailsImpl implements UserDetails {
    //авторизация
    private User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(user.getRole().toString());
        return Collections.singletonList(grantedAuthority);
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
                //user.getState().equals(State.CONFIRMED);
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
                //user.getState().equals(State.BUNED);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
                //user.getState().equals(State.CONFIRMED);
    }

    @Override
    public boolean isEnabled() {
        return true;
               // user.getState().equals(State.CONFIRMED);
    }

    public User getUser() {
        return user;
    }
}
