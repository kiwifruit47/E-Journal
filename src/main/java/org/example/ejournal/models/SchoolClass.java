package org.example.ejournal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "school_classes")
public class SchoolClass extends BasicEntity {

    @Column(length = 3, nullable = false, unique = true)
    private String className;

    @OneToOne
    @JoinColumn(name = "head_teacher_id")
    private Teacher headTeacher;

    @OneToMany(mappedBy = "schoolClass", targetEntity = Student.class)
    private Set<Student> students;

    // трябва ли да има връзка с училището?
//    @ManyToOne
//    private School school;

}
