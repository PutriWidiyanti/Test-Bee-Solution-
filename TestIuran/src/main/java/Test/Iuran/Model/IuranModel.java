package Test.Iuran.Model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tb_iuran")
@EntityListeners(AuditingEntityListener.class)
public class IuranModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long No;
	
	//@NotBlank
	private String nama_kepala_keluarga,bulan,id_KK;
	

	private Integer jumlah_iuran;
	

	public Long getNo() {
		return No;
	}

	public void setNo(Long no) {
		No = no;
	}

	public String getId_KK() {
		return id_KK;
	}

	public void setId_KK(String id_KK) {
		this.id_KK = id_KK;
	}

	public String getNama_kepala_keluarga() {
		return nama_kepala_keluarga;
	}

	public void setNama_kepala_keluarga(String nama_kepala_keluarga) {
		this.nama_kepala_keluarga = nama_kepala_keluarga;
	}


	public Integer getJumlah_iuran() {
		return jumlah_iuran;
	}

	public void setJumlah_iuran(Integer jumlah_iuran) {
		this.jumlah_iuran = jumlah_iuran;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}
	
}
