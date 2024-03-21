public class UserDao{
   public UserDao(){
     System.out.println(""0-param constructor);
   }

  public void message(){
     System.out.println("Welcome...");
  }
  public static void main(String[] args){
    UserDao dao=new UserDao();
    dao.message;
  }

}