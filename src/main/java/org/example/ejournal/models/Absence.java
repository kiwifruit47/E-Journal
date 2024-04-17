package org.example.ejournal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ejournal.enums.WeekDay;

/**
 * The type Absence.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "absences")
public class Absence extends BasicEntity {

    @Enumerated(EnumType.STRING)
    private WeekDay day;

    @ManyToOne
    private Subject subject;

    @ManyToOne
    private Student student;
}
