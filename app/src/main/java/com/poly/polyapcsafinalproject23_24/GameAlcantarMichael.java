package com.poly.polyapcsafinalproject23_24;


import android.view.View;

public class GameMichaelAlcantar extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 1;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        System.out.println("Alone in the cabin");
        System.out.println("You wake up due the loud banging outside of your log cabin");

        start();
    }

    @Overrride
    protected void run()

    @Override
    public void setContentView() {
        R.layout.activity_game_3_button
    }) {
    }

    private void start()
    {
        //start adventure here
        System.out.println("1. Play like its fnaf and go through cameras\n2. Go to the basement and hide.\n3. Call the cops");

        if (choice == 1)
        {
            fnafCams();
        }
        else if (choice == 2)
        {
            basement();
        }
        else if (choice == 3)
        {
            cops();
        }
    }

    private void cops()
    {
        System.out.println("You called the cops and said they are on the way");
        System.out.println("Now you need to wait ");
        System.out.println("1. Hold the front lines\n2. Hide till help arrives. ");


        if (choice == 1)
        {
            war();
        }
        else if (choice == 2)
        {
            help();
        }
    }

    private void help()
    {
        System.out.println("You hide till the police arrives");
        System.out.println("You later hear gunfire outside your home");
        System.out.println("You want to help them but how");
        System.out.println("1. Fire at the monster with your firearms\n2. Use a loud radio distract it ");

        if (choice == 1)
        {
            fireArms();
        }
        else if (choice == 2)
        {
            radio();
        }
    }

    private void radio()
    {

        System.out.println("You managed to distract the monster but all of its focused is on you now ");
        System.out.println("The beast has found its way to you and threw you out of the window injuried you. ");
        System.out.println("The police force is there to help you getting you back up but later fleeing from the monster ");    System.out.println("You were forced to leave your home but still alive");

        dub();
    }


    private void fireArms()
    {

        System.out.println("As the creature is been weakend by police.");
        System.out.println("You join the fight ");
        System.out.println("The police threw molotovs at the beast then thanked you for the assisted");
        System.out.println("They later recuited you to join the secret war against these demonic beings");

        dub();
    }

    private void war()
    {

        System.out.println("You decide to arm yourself and search for the creature ");
        System.out.println("You check the front door ");
        System.out.println("But then the creature jumps you,but before killing you off a helicopter arrives and guns the creature down ");
        System.out.println("One of the men in the helicopter yells fire is it weakness ");
        System.out.println("1. Use the nearby gas canister\2. Use your illegal flamethrower. ");


        if (choice == 1)
        {
            useFire();
        }
        else if (choice == 2)
        {
            useFlamer();
        }
    }

    private void useFire()
    {

        System.out.println("You throw the canister at the monster");
        System.out.println("The canister hits the monster and kills it saving you ");
        System.out.println("The cops later tell you not say anything about the monster because its a goverment secret");
        System.out.println("");

        dub();
    }
    private void useFlamer()
    {

        System.out.println("You use the flamethrower on the creature");
        System.out.println("The fire kills the monster and you survived");
        System.out.println("The cops later arrested you for owning a illegal firearm and will be take to a federal prison");
        System.out.println("");

        dub();
    }

    private void basement()
    {

        System.out.println("You run to the basement and hide behind somecrates");
        System.out.println("The animal breaches the basement and looks around ");
        System.out.println("1. Stare at the animal\2. cover your head and hold your breath. ");



        if (choice == 1)
        {
            stare();
        }
        else if (choice == 2)
        {
            holdBreath();
        }
    }

    private void holdBreath()
    {

        System.out.println("You held your breath and hide behind cover");
        System.out.println("The beast soons leaves the basement, it completely left the house you are safe");

        System.out.println("");

        dub();
    }

    private void stare()
    {

        System.out.println("You stare the the beast ");
        System.out.println("The beast spots you and runs at your direction ");
        System.out.println("1. Get into cover\2. Jump over the beast and run for it. ");



        if (choice == 1)
        {
            cover();
        }
        else if (choice == 2)
        {
            jump();
        }
    }

    private void cover()
    {

        System.out.println("You tried to hide but its too late he found you");

        defeat();
    }

    private void jump()
    {

        System.out.println("You succefuly jump over the beast");
        System.out.println("But sadly you are not faster than it, it catches up to you and grabs you from behind");

        defeat();
    }

    private void fnafCams()
    {

        System.out.println("You check the cameras but see a tall figure with a deer head");

        System.out.println("1. Get a gun then go investigate.\n2. Stay in you room");


        if (choice == 1)
        {
            gunInvestigate();
        }
        else if (choice == 2)
        {
            stayRoom();
        }
    }

    private void stayRoom()
    {

        System.out.println("As you are freaking out you have two options ");
        System.out.println("1. Hide in the room and stay quiet and pray that the creature will go away\n2. Or look for your unregisterd flamethrower you hid from the goverment");



        if (choice == 1)
        {
            hideroom();
        }
        else if (choice == 2)
        {
            betterPryo();
        }
    }

    private void hideroom()
    {

        System.out.println("As you are searching for way to hide, you have two chooses ");
        System.out.println("1. Under the bed\n2. Closet");


        if (choice == 1)
        {
            hidebed();
        }
        else if (choice == 2)
        {
            closet();
        }
    }

    private void closet()
    {

        System.out.println("You quickly hide in the closet, moments later the beast runs into the room ");
        System.out.println(" The creature looks around and runs directly towards you, dragging you out then killing you  ");

        defeat();
    }

    private void hidebed()
    {

        System.out.println(" You quickly hid under the bed, you hear loud foot steps appoaching ");
        System.out.println(" The feral beast barges into the room, it quickly targest the closet destroying it, the beast later leaves home and disappear");
        System.out.println(" You survive the night");

        dub();
    }

    private void betterPryo()
    {
        System.out.println("As you walk towards the front door exited to use the flamethrower ");
        System.out.println("The beast brustes into the front door  ");
        System.out.println("1. Use the flamethrower\n2. RUN AS FAST AS YOU CAN");


        if (choice == 1)
        {
            burn();
        }
        else if (choice == 2)
        {
            freeze();
        }

    }
    private void freeze()
    {
        System.out.println("You get too terrified of fighting the creature you frozed ");
        System.out.println("The creature tackles you down instantly killing you  ");

        defeat();
    }

    private void burn()
    {
        System.out.println("You spray down the giant beast  ");
        System.out.println("It screams in pain running out of the house while set on fire, killing it ");

        dub();
    }

    private void gunInvestigate()
    {
        System.out.println("You are about to leave the cabin but you hear a loud terrifying screech");
        System.out.println(TextColor.RED + " RAEEETETETETE!" + TextColor.RESET);
        System.out.println("1. Choose to still go out side\n2. Remain inside");



        if (choice == 1)
        {
            gunOutside();
        }
    }


    private void gunOutside()
    {
        System.out.println("You run outside aiming your gun and see nothing, you look cautiously but see nothing. As you look into the distance you see 2 red dots coming torwards you.");
        System.out.println("1. Fire your gun at it \n2. RUN INSIDE");


        if (choice == 1 )
        {
            fireGun();
        }
        else if (choice == 2)
        {
            runInside();
        }
    }

    private void fireGun()
    {
        System.out.println("As you fire your gun it does nothing to the beast.");
        System.out.println("As the beast got closer you run out of bullets the creature runs up to you, picks you up and slam you to the ground.");

        defeat();


    }

    private void runInside()
    {
        System.out.println("As you run back inside, you hear a loud thud sound coming from the front porch");
        System.out.println("what should you do");
        System.out.println("1. Spray at the door \n2. Peek through the windows ");


        if (choice == 1)
        {
            sprayGun();
        }
        else if (choice == 2)
        {
            peekWindow();
        }
    }

    private void peekWindow()
    {
        System.out.println("As you look outside, you see the creature running");
        System.out.println("It runs sraight through the door trumbling you over knocking out your gun");
        System.out.println("1. RUN \n2. Pick up the gun and fire at it ");


        if (choice == 1)
        {
            running();
        }
        else if (choice == 2)
        {
            pickUpGun();
        }
    }

    private void pickUpGun()
    {
        System.out.println("As you run to pick up the gun");
        System.out.println("You were too slow and the beast hits you in the ribs sending you flying killing you ");

        defeat();

    }
    private void running()
    {
        System.out.println("As you are running the chases after you ");
        System.out.println("It runs sraight through the door trumbling you over knocking out your gun");
        System.out.println("1. RUN \n2. Use the gun in your holster ");

        if (choice == 1)
        {
            runAgain();
        }
        else if (choice == 2)
        {
            holsterGun();
        }
    }

    private void runAgain()
    {

        System.out.println("As you are being chased the creature chatches up to you");
        System.out.println("It picks to up and slams you to the ground");

        defeat();
    }

    private void holsterGun()
    {
        System.out.println("As you use the gun in your holster the bullets seem to do nothing to the creature");
        System.out.println("The creature tackles and pins you down killing you");
        defeat();
    }

    private void sprayGun()
    {
        System.out.println("You fire into the door ");
        System.out.println("You heard a loud groan outside, You might have damaged it ");
        System.out.println("1. Open the door and check  \n2. Stay inside and peek through the windows ");


        if (choice == 1)
        {
            openDoor();
        }
        else if (choice == 2)
        {
            windowPeek();
        }

    }

    private void openDoor()
    {
        System.out.println("You open the door and look at the creature");
        System.out.println("You look at the beats but it tackles you");
        System.out.println("It was faking its injurys");

        defeat();

    }

    private void windowPeek()
    {
        System.out.println("You peek the window and see the strange  creature on the ground ");
        System.out.println("You see a gas tank next to it");
        System.out.println("1. Fire at the gas tank to harm the creature \n2. Walk outside and check on the crerature");


        if (choice == 1)
        {
            pyro();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void pyro()
    {
        System.out.println("You fire at the gas canister ");
        System.out.println("The creature screams in pain, fire seems to be its weakness");
        System.out.println("It seems like you killed the strange creature and successfully survive");

        dub();
    }

    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println(TextColor.RED + "You are dead" + TextColor.RESET);


        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("PLEASE PLAY AGAIN");
        }
    }

    private void dub()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println(TextColor.BLUE + "You have SURVIVE" + TextColor.RESET);


        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("PLEASE PLAY AGAIN");
        }
    }
}