package ru.almaz.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.almaz.models.User;

@AllArgsConstructor
@Builder
@Data

public class UserDto {

    private String id;
    private String userLogin;
    private String name;
    private String email;
    private String registrationDate;
    private String imageUrl;
    private String role;
    private String address;
    private String telephone;



    public static UserDto from(User user) {
        UserDto userDto = UserDto.builder()
                .userLogin(user.getUserLogin())
                .role(user.getRole().toString())
                .build();

        if (user.getAddress()!=null){
            userDto.setAddress(user.getAddress());
        }

        if (user.getTelephone()!=null){
            userDto.setTelephone(user.getTelephone());
        }

        if (user.getRegistrationDate() != null) {
            userDto.setRegistrationDate(user.getRegistrationDate().toString());
        }

        if (user.getImage() != null) {
            userDto.imageUrl = "/files/" + user.getImage().getStorageFileName();
        }

        if (user.getName() != null) {
            userDto.name = user.getName();
        }

        if (user.getEmail() != null) {
            userDto.email = user.getEmail();
        }

        return userDto;
    }


}
