package com.poly.polyapcsafinalproject23_24;


import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameMichaelAlcantar extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 1;
        //create a scanner object for user input


        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        System.out.println("Alone in the cabin");
        System.out.println("You wake up due the loud banging outside of your log cabin");

        start();

    }


    @Override
    protected void run() {
    setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Loney Cabin");
        tvSubtitle.setText("In the Woods");
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }


    private void start()
    {
        isWon = false;

        tvStoryText.setText("What would you do?");

        setAllBtnsVisible();
        btn1.setText("Play like its fnaf and go through cameras.");
        btn2.setText("Go to the basement and hide.");
        btn3.setText("Call the cops.");
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { fnafCams(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) {basement();}
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { cops(); }
        });

    }

    private void cops()
    {
        tvStoryText.setText("You called the cops and said they are on the way, Now you just need to wait")
        System.out.println("1. Hold the front lines\n2. Hide till help arrives. ");

        setAllBtnsVisible();
        btn1.setText("Hold the front lines");
        btn2.setText("Hide till help arrives");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { war(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { help(); }
        });
    }

    private void help()
    {

        tvStoryText.setText("You hide till the police arrives.You later hear gunfire right outside your home, you wanna helpthem but how?");

        System.out.println("1. Fire at the monster with your firearms\n2. Use a loud radio distract it ");

        setAllBtnsVisible();
        btn1.setText("Fire ar the monster with your firearm.");
        btn2.setText("Use a loud radio to distract it.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { fireArms();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { radio(); }
        });

    }

    private void radio()
    {
        tvStoryText.setText("You managed to distract the monster but all of its focused is on you now");
        tvStoryText.setText("The beast has found its way to you ad threw you out of the window injuring you");
        tvStoryText.setText("The police force is there to help you get back up but later flee from the monster");
        tvStoryText.setText("Tou were force to leave your home but in the end you are still alive");

        dub();
    }


    private void fireArms()
    {

        tvStoryText.setText("As the craeture is been weaken by the police");
        tvStoryText.setText("You join the fight");
        tvStoryText.setText("the police threw molotovs at the beast then t");
        tvStoryText.setText("");



        System.out.println("As the creature is been weakend by police.");
        System.out.println("You join the fight ");
        System.out.println("The police threw molotovs at the beast then thanked you for the assisted");
        System.out.println("They later recuited you to join the secret war against these demonic beings");

        dub();
    }

    private void war()
    {
        tvStoryText.setText("You decide to arm yourself and search for the creature");
        tvStoryText.setText("You check the front door");
        tvStoryText.setText("But then the creature jumps you,but before killing you off a helicopter arrives and guns the creature down");
        tvStoryText.setText("One of the men in the helicopter yells fire is it weakness");


        System.out.println("You decide to arm yourself and search for the creature");
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
        tvStoryText.setText("You throw the canister at the monster");
        tvStoryText.setText("The canister hits the monster and kills it saving you");
        tvStoryText.setText("The cops later tell you not say anything about the monster because its a goverment secret");
        tvStoryText.setText("");

        dub();
    }
    private void useFlamer()
    {
        tvStoryText.setText("You use the flamethrower on the creature");
        tvStoryText.setText("The fire kills the monster and you survived");
        tvStoryText.setText("The cops later arrested you for owning a illegal firearm and will be take to a federal prison");


        dub();
    }

    private void basement()
    {
        tvStoryText.setText("You run to the basement and hide behind somecrates");
        tvStoryText.setText("The animal breaches the basement and looks around ");
        tvStoryText.setText("");

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
        tvStoryText.setText("You held your breath and hide behind cover");
        tvStoryText.setText("The beast soons leaves the basement, it completely left the house you are safe");

        dub();
    }

    private void stare()
    {
        tvStoryText.setText("You stare the the beast");
        tvStoryText.setText("The beast spots you and runs at your direction");
        tvStoryText.setText("");

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
        tvStoryText.setText("You tried to hide but its too late he found you");

        defeat();
    }

    private void jump()
    {
        tvStoryText.setText("You succefuly jump over the beast");
        tvStoryText.setText("But sadly you are not faster than it, it catches up to you and grabs you from behind");

        defeat();
    }

    private void fnafCams()
    {
        tvStoryText.setText("You check the cameras but see a tall figure with a deer head");


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
        tvStoryText.setText("As you are freaking out you have two options");

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
        tvStoryText.setText("As you are searching for way to hide, you have two chooses");

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
        tvStoryText.setText("You quickly hide in the closet, moments later the beast runs into the room");
        tvStoryText.setText(" The creature looks around and runs directly towards you, dragging you out then killing you");

        defeat();
    }

    private void hidebed()
    {
        tvStoryText.setText("You quickly hid under the bed, you hear loud foot steps appoaching");
        tvStoryText.setText("The feral beast barges into the room, it quickly targest the closet destroying it, the beast later leaves home and disappear");
        tvStoryText.setText("You survive the night");

        dub();
    }

    private void betterPryo()
    {
        tvStoryText.setText("As you walk towards the front door exited to use the flamethrower");
        tvStoryText.setText("The beast brustes into the front door");

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
        tvStoryText.setText("You get too terrified of fighting the creature you frozed");
        tvStoryText.setText("The creature tackles you down instantly killing you");

        defeat();
    }

    private void burn()
    {
        tvStoryText.setText("You spray down the giant beast");
        tvStoryText.setText("It screams in pain running out of the house while set on fire, killing it");

        dub();
    }

    private void gunInvestigate()
    {
        tvStoryText.setText("You are about to leave the cabin but you hear a loud terrifying screech");

        System.out.println(TextColor.RED + " RAEEETETETETE!" + TextColor.RESET);
        System.out.println("1. Choose to still go out side\n2. Remain inside");



        if (choice == 1)
        {
            gunOutside();
        }
    }


    private void gunOutside()
    {
        tvStoryText.setText("You run outside aiming your gun and see nothing, you look cautiously but see nothing. As you look into the distance you see 2 red dots coming torwards you");

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
        tvStoryText.setText("As you fire your gun it does nothing to the beast");
        tvStoryText.setText("As the beast got closer you run out of bullets the creature runs up to you, picks you up and slam you to the ground");

        defeat();


    }

    private void runInside()
    {
        tvStoryText.setText("As you run back inside, you hear a loud thud sound coming from the front porch");
        tvStoryText.setText("what should you do");

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
        tvStoryText.setText("As you look outside, you see the creature running");
        tvStoryText.setText("It runs sraight through the door trumbling you over knocking out your gu");

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
        tvStoryText.setText("As you run to pick up the gun");
        tvStoryText.setText("You were too slow and the beast hits you in the ribs sending you flying killing you");


        defeat();

    }
    private void running()
    {
        tvStoryText.setText("As you are running the chases after you");
        tvStoryText.setText("It runs sraight through the door trumbling you over knocking out your gun");

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
        tvStoryText.setText("As you are being chased the creature chatches up to you");
        tvStoryText.setText("It picks to up and slams you to the ground");

        defeat();
    }

    private void holsterGun()
    {
        tvStoryText.setText("As you use the gun in your holster the bullets seem to do nothing to the creature");
        tvStoryText.setText("The creature tackles and pins you down killing you");

        defeat();
    }

    private void sprayGun()
    {
        tvStoryText.setText("You fire into the door");
        tvStoryText.setText("");

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
        tvStoryText.setText("");
        tvStoryText.setText("");
        tvStoryText.setText("");

        System.out.println("You open the door and look at the creature");
        System.out.println("You look at the beats but it tackles you");
        System.out.println("It was faking its injurys");

        defeat();

    }

    private void windowPeek()
    {
        tvStoryText.setText("");
        tvStoryText.setText("");

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
        tvStoryText.setText("");
        tvStoryText.setText("");
        tvStoryText.setText("");

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