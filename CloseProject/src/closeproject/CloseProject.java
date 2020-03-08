/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closeproject;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CloseProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        String npc1 = "";
        int bond_npc1 = 0;
        System.out.println("========================");
        System.out.println("???:Hello");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You: ???");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???:Dont worry just tell your name");
        Scanner input = new Scanner(System.in);
        System.out.print("Your name:");
        String name = input.nextLine();
        System.out.println("???:" + name + " ,you will found every thing what is very strange in this world");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???:Good luck " + name );
        TimeUnit.SECONDS.sleep(2);
        System.out.println("==========MENU==========");
        System.out.println("???:Are you okey?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("???:Phew...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("???: What wrong?");
        System.out.println("======================");
        System.out.println("1.Ask her name");
        System.out.println("2.Ask where are you now");
        System.out.print("Answer: ");
        int Answer01 = input.nextInt();
        System.out.println("======================");
        switch (Answer01) {
            case 1:
                {
                    System.out.println("???:My name is Alice,Nice to meet you");
                    npc1 = "Alice";
                    System.out.println("Alice:I will help you see all of city");
                    break;
                }
            case 2:
                {
                    System.out.println("???:You at heart of Secter Seven");
                    npc1 = "???";
                    System.out.println("======================");
                    System.out.println("1.Ask her name");
                    System.out.println("2.Go out");
                    System.out.print("Answer: ");
                    int Answer02 = input.nextInt();
                    System.out.println("======================");
                    switch (Answer02) {
                        case 1:
                            System.out.println("???:My name is Alice,Nice to meet you");
                            npc1 = "Alice";
                            System.out.println("Alice:I will help you see all of city");
                            break;
                            
                        case 2:
                            System.out.print(npc1 + ":You will go now?");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("...");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println(npc1 + ":Okey good luck traveler");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println(npc1 + ":Wait!!!!....D..D..Did you have a room at hotel?");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println(npc1 + "Didn't? Ok I will help you get that");
                            TimeUnit.SECONDS.sleep(2);
                            break;
                            
                        default:
                            System.out.println("You didnt not answer in choice");
                            TimeUnit.SECONDS.sleep(2);
                            System.out.println("What you want to do is follow the rules");
                            break;
                    }
                    break;
                }
            default:
                System.out.println("You didnt not answer in choice");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("What you want to do is follow the rules");
                break;
        }
        System.out.println("==========At heart of city ======");
        System.out.println("You are at the Hotel");
        TimeUnit.SECONDS.sleep(2);
        System.out.println( npc1 + ": I give you a room for a month and you should if a job");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("==================================");
        System.out.println("1.Thank You");
        System.out.println("2.What job I should do");
        System.out.println("==================================");
        System.out.println("Answer: ");
        int Answer03 = input.nextInt();
        switch (Answer03) {
            case 1:
                System.out.println( npc1 +":your welcom");
                TimeUnit.SECONDS.sleep(2);
                break;
            case 2:
                System.out.println("I think you should be a fisher or waiter");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Eh..?Eh..!!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You...You...can be a knigh its really great!!! that work got money very much");
                TimeUnit.SECONDS.sleep(2);
                break;
            default:
                System.out.println("You didnt not answer in choice");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("What you want to do is follow the rules");
                break;
        }
        System.out.println("===============================");
        System.out.println("1.Get some work");
        System.out.println("2.let her help to find work");
        System.out.println("==================================");
        System.out.print("Answer: ");
        int Answer04 = input.nextInt();
        switch (Answer04) {
            case 1:
                System.out.println( npc1 +"You will get some work now?Oh.. OK..Good luck");
                TimeUnit.SECONDS.sleep(2);
                break;
            case 2:
                System.out.println( npc1 + "Eh... You should get some work at job center");
                TimeUnit.SECONDS.sleep(2);
                break;
            default:
                System.out.println("???:You didnt not answer in choice");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("???:What you want to do is follow the rules");
                break;
        }
        System.out.println("==========Job Center========");
        System.out.println("1.Knight");
        System.out.println("2.fisher");
        System.out.println("1.weiter");
        System.out.println("Job what you chose:");
        int Answer05 = input.nextInt();
        switch (Answer05) {
            case 1:
                System.out.println( npc1 +":eh... really? ... you will be a knight? wow");
                TimeUnit.SECONDS.sleep(2);
                System.out.println(npc1 + ":Have a good time with job");
                TimeUnit.SECONDS.sleep(2);
            case 2:
                System.out.println(npc1 + ":Oh ok, didnt have any thing spacail but...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println(npc1 + ":Your job can help me... eh? My job? Im owner of rasterant.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println(npc1 + ":Ok I will buy your fish but ... you want to catch a good fish to me.");
                bond_npc1 = bond_npc1+1;
                TimeUnit.SECONDS.sleep(2);
            case 3:
                System.out.println( npc1 + ":It ok it ok... not a bad job but you can do your job at my rasterant.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println(npc1 + ":Eh... My job? Im owner of rasterant,You will do job at my rasterant?/// ///");
                bond_npc1 = bond_npc1+2;
                TimeUnit.SECONDS.sleep(2);
            default:
                System.out.println("???:You didnt not answer in choice");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("???:What you want to do is follow the rules");
                break;
        }
    }
    
}
