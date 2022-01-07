

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.example.demo.layer2.User;

public class OneToOneMapping{
	
	@Test
	public void insertUser() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		        User user = new User(); //new/blank entity object 
		        user.setAdharNo(1234567890);
			    user.setTitle("saving_Account");
				user.setFullName("rushabh");
		        user.setMobileNo(897534842);
			    user.setEmailId("rushabh@97");
				user.setFatherName("prakash");
				user.setDob(LocalDate.of(1997, 9, 27));
				user.setPermanentAddressLine1("sbi");
				user.setPermanentAddressLine2("line2");
				user.setpAddressLandMark("waterTank");;
				user.setpAddressCity("Shegaon");
				user.setpAddressState("MHA");
				user.setpAddressPincode(444203);
				user.setTemporaryAddressLine1("magarpatta");
				user.setTemporaryAddressLine2("near ");
				user.settAddressLandMark("nobalHospit");
				user.settAddressCity("pune");
				user.settAddressState("Maharastra");
				user.settAddressPincode(511052);
				user.setOccupation("Enggi");
				user.setSourceOfIncome("job");
				user.setGrossIncome(15000);
				
			entityManager.persist(user); //generate the insert query for us 
		transaction.commit();
	}


}
