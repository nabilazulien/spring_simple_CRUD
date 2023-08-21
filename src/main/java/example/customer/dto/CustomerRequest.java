package example.customer.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerRequest {
    public Integer NIK;
    public String Nama;
    public String TempatLahir;
    public String TanggalLahir;
    public String Agama;
    public String Alamat;
}
