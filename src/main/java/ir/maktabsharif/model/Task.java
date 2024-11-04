package ir.maktabsharif.model;

import ir.maktabsharif.base.model.BaseModel;
import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task")
public class Task extends BaseModel {
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_created;
    @Temporal(TemporalType.DATE)
    private Date date_done;
    @ManyToOne
    @JoinColumn(name = "fkusers")
    private User user;

}
