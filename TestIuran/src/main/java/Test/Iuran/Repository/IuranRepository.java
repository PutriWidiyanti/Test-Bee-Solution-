package Test.Iuran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Test.Iuran.Model.IuranModel;

public interface IuranRepository extends JpaRepository<IuranModel, Long> {

}
