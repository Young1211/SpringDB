package pack01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import db.OracleDB;

//@CrossOrigin
@RestController //�������� ������ �ؽ�Ʈ�� ��ȯ�Ѵ�. Controller�� �並 ��ȯ 
public class Tiger {
	OracleDB db = new OracleDB();
	@RequestMapping("/t16")
	public String create(@RequestBody Apple apple) {
		System.out.println(apple.getName());
		System.out.println(apple.getAge());
		db.executeUpdateQuery(
			"insert into appletable  values(" +
			"'" + apple.getName() + "'" + "," +
			apple.getAge() + ")"
				);
		return "";
	}
	
	@ResponseBody //�� �������� �������� �ʰ� return ���� �״�� ��ȯ�Ѵ�	
	@RequestMapping("/t15")
	public ArrayList<Apple> read() {
		ResultSet rs = db.executeQuery("select *from appletable");
		ArrayList<Apple> apple = new ArrayList<>();
		try {
			while (rs.next()) {
				apple.add(new Apple(rs.getString("name"), rs.getInt("age")));

			}
		} catch (SQLException e) {
		}
		return apple;
	}

	@RequestMapping("/t17")
    public String update(@RequestBody Apple apple) {
        db.executeUpdateQuery(
            " update appletable set age = " + apple.getAge() + 
            " where name = " + "'" + apple.getName() +"'");
        return "";
    }
    class NameGetter {
        public NameGetter(String name) {
            this.name = name;
        }
        String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    @RequestMapping("/t18")
    public String delete(@RequestBody String name) {
        System.out.println(name); // �̰� �Ľ̶����� �׷��� ������ =�� �پ��ִ� 
        String temp = name.replaceAll("=","");
        System.out.println(1234);
        System.out.println(temp); 
        db.executeUpdateQuery(
            "delete from appletable where name = " + "'" + temp +"'");
        return "";
    }
	
	
	
	
	
}
