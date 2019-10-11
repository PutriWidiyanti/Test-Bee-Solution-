package Test.Iuran.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Test.Iuran.DAO.IuranDao;
import Test.Iuran.Model.IuranModel;

@RestController
@RequestMapping("/bayar")
public class IuranController {

	@Autowired
	IuranDao iuranDao;
	
	//save
		@PostMapping("/iuranSave")
		public IuranModel save(@Valid @RequestBody IuranModel iuran) {
			return iuranDao.save(iuran);
		}
		
		//getAll
		@GetMapping("/iuranget")
		public List<IuranModel> getAll(){
			return iuranDao.getAll();
		}
		
		//get BY Id
		@GetMapping("/iuranget1/{id_iuran}")
		public ResponseEntity<IuranModel> getById(@PathVariable(value="id_iuran") Long No){
			IuranModel tb=iuranDao.getFindOne(No);
			
			if(tb==null) {
				return ResponseEntity.notFound().build();
			}else {
				return ResponseEntity.ok().body(tb);
			}
		}
		
		
		@DeleteMapping("/iurandelete/{id_iuran}")
		public ResponseEntity<IuranModel> hapus(@PathVariable(value="id_iuran") Long No){
			IuranModel tb=iuranDao.getFindOne(No);
			
			if(tb==null) {
				return ResponseEntity.notFound().build();
			}else {
				iuranDao.delete(No);
				return ResponseEntity.ok().build();
			}
		}
		
		@PutMapping("/tbupdate/{id_iuran}")
		public ResponseEntity<IuranModel> update(@PathVariable(value="id_iuran") Long id,@Valid @RequestBody IuranModel IuranModel){
			IuranModel tb=iuranDao.getFindOne(id);
			if(tb==null) {
				return ResponseEntity.notFound().build();
			}else {
				tb.setId_KK(IuranModel.getId_KK());
				tb.setNama_kepala_keluarga(IuranModel.getNama_kepala_keluarga());
				tb.setJumlah_iuran(IuranModel.getJumlah_iuran());
				tb.setBulan(IuranModel.getBulan());
				IuranModel IuranResult=iuranDao.save(tb);
				return ResponseEntity.ok().body(IuranResult);
			}
		}
}
