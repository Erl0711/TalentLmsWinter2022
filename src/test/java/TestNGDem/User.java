package TestNGDem;

import lombok.*;
//@Data //Абсолютно все аннотации
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
//@NoArgsConstructor

public class User {

    private String name;
    private int age;

    public void sayHi(){
        System.out.println("Hello from Erl" + getName());
    }

    public void login(String username, String password){
        System.out.println("login" + age);
    }


}
