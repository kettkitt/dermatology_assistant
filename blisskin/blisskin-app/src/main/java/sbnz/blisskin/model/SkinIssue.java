package sbnz.blisskin.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "SkinIssues")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class SkinIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String name;

    // importance LOW | HIGH


}
