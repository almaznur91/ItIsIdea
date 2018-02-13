package ru.almaz.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.almaz.models.User;
import ru.almaz.repositories.UserRepository;

//описывает класс который пощвонлит Спрингу доставать пользователя из ьазы данных


@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    @Autowired
    UserRepository userRepository;


//    @Override
//    public UserDetails loadUserByUsername(String userLogin) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(userLogin);
//        if (user!=null){
//            return new UserDetailsImpl();
//        }
//        else throw new IllegalArgumentException( "Чет найти немогц пользователя") ;
//    }


    @Override
    public UserDetails loadUserByUsername(String userLogin) throws UsernameNotFoundException {
        return new UserDetailsImpl(userRepository.findByUserLogin(userLogin).
                orElseThrow(()-> new IllegalArgumentException("Чет не могу найти")));
    }
}
