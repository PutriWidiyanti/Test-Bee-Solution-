package Test.Iuran.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test.Iuran.Model.IuranModel;
import Test.Iuran.Repository.IuranRepository;

@Service
public class IuranDao {

	@Autowired
	IuranRepository iuranRepository;
		
	public List<IuranModel> getAll(){
			return iuranRepository.findAll();
	}
	
	//get By Id
		public IuranModel getFindOne(Long No) {
			return iuranRepository.findOne(No);
		}
		
		
		//save
		public IuranModel save(IuranModel iuran) {
			return iuranRepository.save(iuran);
				}
		
		//delete
		public void delete(Long id_iuran) {
			iuranRepository.delete(id_iuran);
		}
		
		
}
