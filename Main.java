
class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");
    tree1.print();
    tree2.print();
    tree1.print();
  }
}
  class Tree{
    private String treeName;
    private String treeType;
    private boolean leavesFall;
    private String leafColor;
    private String doleavesFall; 

    Tree () {
      treeName ="";
      treeType = "";
      leavesFall = false;
      leafColor = "";
      }

    Tree(String atreeName, String atreeType, boolean aleavesFall, String aleafColor) {
      treeName =atreeName;
      treeType = atreeType;
      leavesFall = aleavesFall;
      leafColor = aleafColor;
      }
    

    void  setName(String thetreeName){
      treeName=thetreeName;
    }
    void  setType(String thetreeType){
      treeType = thetreeType;
    }
     void setFall(boolean theleavesFall){
      leavesFall = theleavesFall;
    }
    void leafColor(String theleafColor){
      leafColor=theleafColor;
    }
    String getName(){
      return treeName;
    }
    String getType(){
      return treeType;
    }
    boolean getFall(){
      return leavesFall;
    }
    String getleafColor(){
      return leafColor;
    }
        
      void print(){
      
      System.out.println("This is a " + treeName + " Tree. It is a " + treeType + " and its leaves are currenty " + leafColor + ". It " + (leavesFall ? "Does" : "Does Not") +" lose its leaves for the winter.");
    }
  }

