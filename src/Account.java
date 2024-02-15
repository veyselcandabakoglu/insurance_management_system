public abstract class Account {

    private User user;

    public final void showUserInfo() {
        System.out.println("---------- CUSTOMER INFO ----------");
        System.out.println("Name : "+ user.getName());
        System.out.println("Surname : "+ user.getSurname());
        System.out.println("E-Mail : "+ user.getEmail());
        System.out.println("Age : "+ user.getAge());
        System.out.println("Job : "+ user.getJob());
        System.out.println();
        System.out.println("---------- ADDRESS LIST ----------");
        for(int i = 0; i < user.getAddressList().size(); i++) {
            System.out.println((i+1)+ ". Address : ");
            System.out.println(user.getAddressList().get(i).getCountry()+ " , "
                                +user.getAddressList().get(i).getCity()+ " , "
                                +user.getAddressList().get(i).getTown()+" , "
                                +user.getAddressList().get(i).getStreet()+" , "
                                +user.getAddressList().get(i).getNo());
        }

        System.out.println();
        System.out.println("---------- INSURANCE LIST ----------");
        for(Insurance i : user.getInsurances()) {
            System.out.println("Insurance Type : "+ i.getClass().getSimpleName());
            System.out.println("Price of Insurance : "+i.calculate());
			System.out.println("Start date : "+i.getStartDate());
			System.out.println("Finish date : "+i.getEndDate());
			System.out.println();
        }
    }

    public Account(User user) {
        super();
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}