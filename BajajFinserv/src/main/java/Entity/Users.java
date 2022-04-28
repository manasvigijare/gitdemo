package Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
	@Table(name = "users")
	@EntityListeners(AuditingEntityListener.class)
	public class Users {

	    

	    @Column(name = "status", nullable = false)
	    private boolean status;

	    @Id
	    @Column(name = "UserId", nullable = false)
	    private int UserId;

	    @Column(name = "emailid", nullable = false)
	    private String emailid;

	    @Column(name = "CollegeRollNo", nullable = false)
	    private int CollegeRollNo;

	    @Column(name = "ArrayOfNumbers", nullable = false)
	    private int No;
	    
	    @Column(name = "Alphabets", nullable = false)
	    private String Alphabets;

		public int getNo() {
			return No;
		}

		public void setNo(int no) {
			No = no;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public int getUserId() {
			return UserId;
		}

		public void setUserId(int userId) {
			UserId = userId;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public int getCollegeRollNo() {
			return CollegeRollNo;
		}

		public void setCollegeRollNo(int collegeRollNo) {
			CollegeRollNo = collegeRollNo;
		}
	    
	    

	   
}


