package pl.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "INCOMES")
public class Income {

    @GeneratedValue
    @Id
    private long id;
    @ManyToOne
    Source source;
    boolean isItMonthly;
}
