class CommandlineArgument{
    public static void main(String[] args){
    int a , b = 2;
    int n = Integer.parseInt(args[0]);
    for(a = 2; a<= n ; a++)
    { 
    b = b+a;
    }
    System.out.println("factorial is" +b);
    }
    }


