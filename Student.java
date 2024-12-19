package backend;

public class Student {
		
		String name;
		int age;
		String gender;
		String qual;
		String phone;
		String address;
		String district;
		public Student(String name, int age, String gender, String qual, String phone, String address,
				String district) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.qual = qual;
			this.phone = phone;
			this.address = address;
			this.district = district;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getQual() {
			return qual;
		}
		public void setQual(String qual) {
			this.qual= qual;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		
		//Generate Constructors using fields
	
		
}
