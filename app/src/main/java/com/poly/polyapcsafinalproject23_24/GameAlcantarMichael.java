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
        ivStory.setImageResource(R.drawable.cabin_in_the_woods);
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
        ivStory.setImageResource(R.drawable.looking_down_to_a_phone);

        tvStoryText.setText("You called the cops and said they are on the way, Now you just need to wait")

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
        ivStory.setImageResource(R.drawable.hiding_in_the_basement);
        tvStoryText.setText("You hide till the police arrives.You later hear gunfire right outside your home, you wanna helpthem but how?");

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
        ivStory.setImageResource(R.drawable.using_loud_music_to_distracted_a_wendigo_to_protect_the_police);

        tvStoryText.setText("You managed to distract the monster but all of its focused is on you now");
        tvStoryText.setText("The beast has found its way to you ad threw you out of the window injuring you");
        tvStoryText.setText("The police force is there to help you get back up but later flee from the monster");
        tvStoryText.setText("Tou were force to leave your home but in the end you are still alive");

        dub();
    }


    private void fireArms()
    {

        tvStoryText.setText("As the creature is been weaken by the police");
        tvStoryText.setText("You join the fight");
        tvStoryText.setText("the police threw molotovs at the beast then thanked you for your services");
        tvStoryText.setText("They later recruited you to join the secret war against these demonic beings");

        dub();
    }

    private void war()
    {
        tvStoryText.setText("You decide to arm yourself and search for the creature");
        tvStoryText.setText("You check the front door");
        tvStoryText.setText("But then the creature jumps you,but before killing you off a helicopter arrives and guns the creature down");
        tvStoryText.setText("One of the men in the helicopter yells fire is it weakness");

        setAllBtnsVisible();
        btn1.setText("Use the nearby gas canister");
        btn2.setText("Use your illegal flamethrower");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { useFire();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { useFlamer();}
        });

    }

    private void useFire()
    {
        tvStoryText.setText("You throw the canister at the monster");
        tvStoryText.setText("The canister hits the monster and kills it saving you");
        tvStoryText.setText("The cops later tell you not say anything about the monster because its a goverment secret");

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

        setAllBtnsVisible();
        btn1.setText("Stare at the animal");
        btn2.setText("over your head and hold your breath");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { stare(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { holdBreath(); }
        });

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

        setAllBtnsVisible();
        btn1.setText("Get into cover");
        btn2.setText("Jump over the beast and run for it");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { cover(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { jump(); }
        });

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
        btn1.setText("Get a gun then go investigate");
        btn2.setText("Stay in you room");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { gunInvestigate(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { stayRoom(); }
        });

    }

    private void stayRoom()
    {
        tvStoryText.setText("As you are freaking out you have two options");

        btn1.setText("Hide in the room and stay quiet and pray that the creature will go away");
        btn2.setText("Or look for your unregister flamethrower you hid from the government");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { hideroom(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { betterPryo(); }
        });

    }

    private void hideroom()
    {
        tvStoryText.setText("As you are searching for way to hide, you have two chooses");

        btn1.setText("Under the bed");
        btn2.setText("Closet");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { hidebed(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { closet(); }
        });

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

        btn1.setText("Use the flamethrower");
        btn2.setText("RUN AS FAST AS YOU CAN");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { burn(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { freeze(); }
        });


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
        tvStoryText.setText("RAEEETETETE!");

        btn1.setText("Choose to still go out side");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { gunOutside(); }
        });
    }


    private void gunOutside()
    {
        tvStoryText.setText("You run outside aiming your gun and see nothing, you look cautiously but see nothing. As you look into the distance you see 2 red dots coming torwards you");

        btn1.setText("Fire your gun at it");
        btn2.setText("RUN INSIDE");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { fireGun(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { runInside(); }
        });


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

        btn1.setText("Spray at the door");
        btn2.setText("Peek through the windows");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { sprayGun(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { peekWindow(); }
        });

    }

    private void peekWindow()
    {
        tvStoryText.setText("As you look outside, you see the creature running");
        tvStoryText.setText("It runs sraight through the door trumbling you over knocking out your gu");

        btn1.setText("RUN");
        btn2.setText("Pick up the gun and fire at it");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { running(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { pickingUpGun(); }
        });
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

        btn1.setText("RUN");
        btn2.setText("Use the gun in your holster");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { runagain(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { holsterGun(); }
        });

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
        tvStoryText.setText("You heard a loud groan outside, You might have damaged it");

        btn1.setText("Open the door and check");
        btn2.setText("Stay inside and peek through the windows");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { openDoor(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { windowPeek(); }
        });


    }

    private void openDoor()
    {
        tvStoryText.setText("You open the door and look at the creature");
        tvStoryText.setText("You look at the beats but it tackles you");
        tvStoryText.setText("It was faking its injury");

        defeat();

    }

    private void windowPeek()
    {
        tvStoryText.setText("You peek the window and see the strange creature on the ground");
        tvStoryText.setText("You see a gas tank next to it");

        btn1.setText("Fire at the gas tank to harm the creature");
        btn2.setText("Walk outside and check on the creature");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { pryo(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(VIEW v) { defeat(); }
        });

    }

    private void pyro()
    {
        tvStoryText.setText("You fire at the gas canister ");
        tvStoryText.setText("The creature screams in pain, fire seems to be its weakness");
        tvStoryText.setText("It seems like you killed the strange creature and successfully survive");

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