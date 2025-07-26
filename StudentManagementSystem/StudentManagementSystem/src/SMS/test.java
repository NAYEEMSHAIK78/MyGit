package SMS;
public class test {
	public static void main(String[] args) {
		Info i=new Info();
		i.setId(1111);
		i.setName("nayeem");
		i.setMobileNo("8143138743");
		i.setEmail("nayeembashapgr37@gmail.com");
		i.setSub1(85);
		i.setSub2(68);
		i.setSub3(98);
		i.setSub4(98);
		i.setSub5(88);
		System.out.println(MainDriver.addStdntDetails(i));
	}
}
