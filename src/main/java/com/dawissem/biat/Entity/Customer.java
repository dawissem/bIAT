package com.dawissem.biat.Entity;

import com.dawissem.biat.Enum.CustomerEnum;
import com.dawissem.biat.Enum.GenderEnum;
import com.dawissem.biat.Enum.Legal_Doc_Enum;
import com.dawissem.biat.Enum.Nationality;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID", nullable = false)

    private Long CUSTOMER_ID;


    @Lob
    @Column(name = "CUSTOMER_TYPE", nullable = true)
    private CustomerEnum customerType;

    @Column(name = "shortName", length = 60)
    private String shortName;

    @Lob
    @Column(name = "GENDER")
    private GenderEnum gender;

    @Column(name = "DATE_BIRTH_CREATION")
    private Date dateBirthCreation;

    @Column(name = "ADDRESS", length = 60)
    private String address;

    @Column(name = "POST_CODE")
    private Integer postCode;

    @Lob
    @Column(name = "LEGAL_DOC_NAME", nullable = false)
    private Legal_Doc_Enum legalDocName;

    @Column(name = "LEGAL_ID", length = 30)
    private Integer legalId;



    @JoinColumn(name = "nationality", nullable = false)
    private Nationality nationality;

    //houni nationality raditha enum wakteli hiya foreighkey mtepointi 3a country


    @Column(name = "ACCOUNT_OFFICER")
    private Integer accountOfficer;

    @Column(name = "TEL", length = 20)
    private String tel;

    @Column(name = "MAIL", length = 30)
    private String mail;

    @JsonCreator

    public Customer(CustomerEnum customerType, String shortName, GenderEnum gender, Date dateBirthCreation, String address, Integer postCode, Legal_Doc_Enum legalDocName, Integer legalId, Nationality nationality, Integer accountOfficer, String tel, String mail, Long CUSTOMER_ID) {
        this.customerType = customerType;
        this.shortName = shortName;
        this.gender = gender;
        this.dateBirthCreation = dateBirthCreation;
        this.address = address;
        this.postCode = postCode;
        this.legalDocName = legalDocName;
        this.legalId = legalId;
        this.nationality = nationality;
        this.accountOfficer = accountOfficer;
        this.tel = tel;
        this.mail = mail;
        this.CUSTOMER_ID = CUSTOMER_ID;
    }
}