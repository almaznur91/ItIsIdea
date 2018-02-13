package ru.almaz.forms;

import lombok.Data;
import ru.almaz.models.User;

@Data
public class UpdateUserForm {
    String userLogin;
    String email;
    String name;
    String address;
    String telephone;


    public void update(User user) {


        if (name.equals("")) {
            name = null;
        }
        user.setName(name);
        if (address.equals("")) {
            address = null;
        }
        user.setAddress(address);
        if (telephone.equals("")) {
            telephone = null;
        }
        user.setTelephone(telephone);


    }


}
