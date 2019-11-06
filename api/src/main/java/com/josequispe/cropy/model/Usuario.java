package com.josequispe.cropy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario{

    @Id
    @SequenceGenerator(name = "USUARIO_IDPER_GEN", sequenceName = "USUARIO_IDPER_SEQ", allocationSize = 1, initialValue = 6)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_IDPER_GEN")
    Long IDPER;

    @Column(columnDefinition = "varchar2(100)")
    String NOMPER;

    @Column(columnDefinition = "varchar2(100)")
    String APEPER;

    public Long getIDPER() {
        return IDPER;
    }

    public void setIDPER(Long iDPER) {
        IDPER = iDPER;
    }

    public String getNOMPER() {
        return NOMPER;
    }

    public void setNOMPER(String nOMPER) {
        NOMPER = nOMPER;
    }

    public String getAPEPER() {
        return APEPER;
    }

    public void setAPEPER(String aPEPER) {
        APEPER = aPEPER;
    }

}