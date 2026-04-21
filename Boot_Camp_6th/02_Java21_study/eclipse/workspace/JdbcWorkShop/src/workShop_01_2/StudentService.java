package workShop_01_2;

import java.util.List;

public interface StudentService {
	
	
	public abstract void setDao(StudentDAO dao);
	public abstract List<StudentDTO> list();

}
