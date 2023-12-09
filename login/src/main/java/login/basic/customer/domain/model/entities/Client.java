package login.basic.customer.domain.model.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotEmpty
    @Column(name="name",length=55,nullable=false)
    private String name;
    @NotNull
    @NotEmpty
    @Column(name="correo",length=55,nullable=false)
    private String correo;
    @NotNull
    @NotEmpty
    @Column(name="password",length=55,nullable=false)
    private String password;
}
