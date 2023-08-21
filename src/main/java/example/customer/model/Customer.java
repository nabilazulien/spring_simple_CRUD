package example.customer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "customer")
public class Customer {
    @Column
    @Id
    private int id;

    @Column(name = "NIK")
    private int nik;

    @Column(name = "Nama")
    private String nama;

    @Column(name = "Tempat_Lahir")
    private String tempatLahir;

    @Column(name = "Tanggal_Lahir")
    private String tanggalLahir;

    @Column(name = "Agama")
    private String agama;

    @Column(name = "Alamat")
    private String alamat;
}
