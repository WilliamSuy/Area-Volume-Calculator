/******************************************************************************
 * [Name]
 * [Class]
 * [Description]
*******************************************************************************/
package areaandvolume;

import java.util.Scanner;

public class AreaAndVolume {

    public static void main(String[] args) {
        
        //Allows the Scanner use and user inputs
        Scanner input = new Scanner(System.in);
        
        //Prompts a welcome message
        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|                                         |");
        System.out.println("| Welcome to Area and Volume Conversions! |");
        System.out.println("|                                         |");
        System.out.println("|                                         |");
        System.out.println("___________________________________________");
        
        //Explains the program
        System.out.println("\nIn this program, you will be able to choose to "
                + "compute either the area or the volume of shapes.");
        
        //Asks user if they would like to compute area or volume
        System.out.print("Please state what value you want to calculate for, "
                + "\'area\' or \'volume\': ");
        String value = input.nextLine();
        
/******************************************************************************
*************************Calculates the Area of a Shape************************
*******************************************************************************/

        if ("area".equals(value)) {
            
            //Asks user to choose what shape to find the area of
            System.out.println("\n\n\nShape choices: Square, Rectangle, Circle, Triangle, "
                    + "Parallelogram, Semi Circle, Ellipse");
            System.out.print("What shape will you like to find the area of?: ");
            String shapea = input.nextLine();
            
            //if statement for which shape to find the area of
            if (null != shapea) switch (shapea) {
                
                //if the shape is a square
                case "square":
                    System.out.print("Enter a side of the square: "); //asks for a side the square
                    double squareside = input.nextDouble(); //prompts user for answer
                    double squarearea = (squareside) * (squareside); //calculates the area
                    System.out.println("The area of the cube with a side length "
                            + "of " + squareside + " is " + squarearea + " units."); //displays the answer
                    break;
                
                //if the shape is a rectangle
                case "rectangle":
                    System.out.print("Enter the length of the rectangle: "); //asks for the side of the length
                    double reclengtha = input.nextDouble(); //prompts user for length
                    System.out.print("Enter the width of the rectangle: "); //asks for the side of the width
                    double recwidtha = input.nextDouble(); //prompts user for width
                    double recarea = (reclengtha) * (recwidtha); //calculates the area of the rectangle and stores the value in the variable 'recarea'
                    System.out.println("The area of a rectangle with a length "
                            + "of " + reclengtha + " and width of " + recwidtha
                            + " equals " + recarea + " units."); //displays the answer
                    break;
                
                //if the shape is a circle    
                case "circle":
                    System.out.print("Enter the radius of the circle: "); //asks user for the radius of the circle
                    double radiusa = input.nextDouble(); //prompts user for the radius
                    double circlearea = (3.14159 * radiusa * radiusa); //calcualtes the area of the circle ans stores the value in variable 'circlearea'
                    System.out.println("The area of a circle with a radius of "
                            + "" + radiusa + " equals to " + circlearea + " units.");
                    break;
                    
                //if the shape is a triangle
                case "triangle":
                    System.out.print("Enter the base of the triangle: "); //asks user for the base of the triangle
                    double tribase = input.nextDouble(); // prompts user for the base
                    System.out.print("Enter the length of the triangle: "); //asks user for the length of the triangle
                    double trilength = input.nextDouble(); //prompts the user for the length
                    double triarea = (0.5 * tribase * trilength); //calculates the area of the triangle
                    System.out.println("The area of a triangle with a base "
                            + "of " + tribase + " and a length of " + trilength +
                            " is " + triarea + " units.");//prints out the answer
                    break;
                    
                //if the shape is a parallelogram
                case "parallelogram":
                    System.out.print("Enter the base of the parallelogram: "); //asks user for the base of the parallelogram
                    double parbase = input.nextDouble(); //prompts user for the base
                    System.out.print("Enter the length of the parallelogram: "); //asks user for the length of the parallelogram
                    double parlength = input.nextDouble(); //prompts user for the length
                    double pararea = (parbase * parlength); //calculates the area of the parallelogram
                    System.out.println("The area of a parallelogram with a base "
                            + "of " + parbase + " and a length of " + parlength + 
                            " is " + pararea + " units."); //prints out the answer
                    break;
                
                //if the shape is a Semi Circle
                case "semi circle":
                    System.out.print("Enter the radius of the semi-circle: ");
                    double semiradius = input.nextDouble();
                    double semiarea = (3.14159 * semiradius * semiradius) / (0.5);
                    System.out.println("The area of a semi-circle with a radius of "
                            + "" + semiradius + " equates to " + semiarea + " units.");
                    break;
                
                //if the shape is an ellipse
                case "ellipse":
                    System.out.print("Enter the first radius point: ");
                    double radius1 = input.nextDouble();
                    System.out.print("Enter the second radius point: ");
                    double radius2 = input.nextDouble();
                    double ellipsearea = (3.14159 * radius1 * radius2);
                    System.out.println("The area of an ellipse with a focal point"
                            + " of " + radius1 + " and " + radius2 + " equates to "
                                    + "" + ellipsearea + " units.");
                    break;
                
                //if the input is different or misspelt    
                default:
                    System.out.print("\nSorry, that is an invalid choice.");
                    break;
            }
        }
/******************************************************************************
*************************Calculates the Volume of a Shape**********************
*******************************************************************************/
            
        else if ("volume".equals(value)){
            
            //Asks user to choose what shape to find the volume of
            System.out.println("\n\n\nShape choices: Cube, Rectangular Prism, Sphere, Cone, "
                    + "Pyramid, Cylinder");
            System.out.print("What shape will you like to take the volume of?: ");
            String shapev = input.nextLine();
            
            if (null != shapev) switch(shapev) {
                
                //if the shape is a cube
                case "cube":
                    System.out.print("Enter the side for the cube: ");
                    double cubeside = input.nextDouble();
                    double cubev = (cubeside * cubeside *cubeside);
                    System.out.println("The volume of the cube with a side length"
                            + " of " + cubeside + " is " + cubev + " units.");
                    break;
                
                //if the shape is a rectangular prism    
                case "rectangular prism":
                    System.out.print("Enter the length of the rectangular prism: ");
                    double reclength = input.nextDouble();
                    System.out.print("Enter the width of the rectangular prism: ");
                    double recwidth = input.nextDouble();
                    System.out.print("Enter the height of the rectangular prism: ");
                    double recheight = input.nextDouble();
                    double recvolume = (reclength * recwidth * recheight);
                    System.out.println("The volume of a rectangular prism with a "
                            + "length of " + reclength + ", width of " + 
                            recwidth + ", and a height of " + recheight + 
                            " equates to " + recvolume + " units.");
                    break;
                
                //if the shape is a sphere
                case "sphere":
                    System.out.print("Enter the radius of the sphere: ");
                    double sphererad = input.nextDouble();
                    double spherevol = (4/ 3) * (sphererad * sphererad) * (3.14159);
                    System.out.println("The volume of a sphere with a radius of "
                            + "" + sphererad + "equates to " + spherevol + " units.");
                    break;
                
                //if the shape is a cone
                case "cone":
                    System.out.print("Enter the radius of the cone: ");
                    double coneradius = input.nextDouble();
                    System.out.print("Enter the height of the cone: ");
                    double coneheight = input.nextDouble();
                    double conevolume = (3.14159) * (coneradius * coneradius) * (coneheight/ 3);
                    System.out.println("The volume of the cone with at radius of "
                            + "" + coneradius + " and a height of " + coneheight + ""
                                    + " equates to a volume of " + conevolume + " units.");
                    break;
                
                //if the shape is a pyramid    
                case "pyramid":
                    System.out.print("Enter the length of the rectangular pyramid: ");
                    double pyrlength = input.nextDouble();
                    System.out.print("Enter the width of the rectangular pyramid: ");
                    double pyrwidth = input.nextDouble();
                    System.out.print("Enter the height of the rectangular pyramid: ");
                    double pyrheight = input.nextDouble();
                    double pyrvolume = (pyrlength * pyrwidth * pyrheight) / 3;
                    System.out.println("The volume of a rectangular pyramid with a "
                            + "length of " + pyrlength + ", a width of " + 
                            pyrwidth + ", a height of " + pyrheight + " equates "
                                    + "to a volume of " + pyrvolume + " units.");
                    break;
                
                //if the shape is a cylinder    
                case "cylinder":
                    System.out.print("Enter the radius of the cylinder: ");
                    double cylradius = input.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double cylheight = input.nextDouble();
                    double cylvolume = (3.14159 * cylradius * cylradius * cylheight);
                    System.out.println("The volume of cylinder with a radius of "
                            + "" + cylradius + " and a height " + cylheight + 
                            " equates to " + cylvolume + " units. ");
                    break;
                
                //if the input if different or misspelt 
                default:
                    System.out.print("\nSorry that is an invalid input.");
                break;
            
        }
/******************************************************************************
*************************Returns an error to restart program*******************
*******************************************************************************/

        System.out.println("\nProgram finish. Please restart the program.");
        
        }
    }
}
    
