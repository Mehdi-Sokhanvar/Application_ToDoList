package ir.maktabsharif.model;

import ir.maktabsharif.base.model.BaseModel;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")

public class User extends BaseModel {
    @Column(name = "user_name",length = 10)
    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Task> taskUser;

}
