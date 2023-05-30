public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        int gryffindor = 850;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;
        if(margin >= 300){
            System.out.println("Gryffindor takes the hoouse cup!");
        }else if(margin >= 0){
            System.out.println("In Second Place: Gryffindor");
        } else if(margin >= -100){
            System.out.println("In Third Place: Gryffindor");
        }else{
            System.out.println("In Fourth Place: Gryffindor");
        }
    }
}