package dev.ruben.examenjava.rest.luchador.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="LUCHADOR")
public class Luchador {
    public static final String IMAGE_DEFAULT = "https://via.placeholder.com/150";
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank(message = "no puede estar vacio el nombre")
    @Column(name = "nombre", columnDefinition = "nombre")
    private String nombre;
    private int idRaza;
    @NotBlank(message = "no puede estar vacio el a ")
    @Column(columnDefinition = "TEXT default '" + IMAGE_DEFAULT + "'")
    private String avatar;
    @Min(value = 0,message = "El poder tiene que ser 0 o mayor")
    private Long poder;
    private String planetaOrigen;
    private String ataqueFinal;
    @CreationTimestamp
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt= LocalDateTime.now();
    @UpdateTimestamp
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt= LocalDateTime.now();






}
