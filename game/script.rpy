# You can place the script of your game in this file.

# Declare images below this line, using the image statement.
# eg. image eileen happy = "eileen_happy.png"

image bg fondo = "cielo.jpg"
image Rika = "Lv9qm.jpg"
image Mio = "Mio.png"
image bg Clase = "clase 2.jpg"
image bg labs = "labs.jpg"
image bg lake = "lake.jpg"

# Declare characters used by this game.
define e = Character('Mio', color="#c8ffc8")

define b = Character('Kyosuke', color="#c9dde9")

define a = Character('Rika', color="#c9ddf7")

# The game starts here.
label start:
    
    play music "Clannad ost-Shining in the sky.mp3"
    
    scene bg labs
    with fade
    
    show Mio
    with dissolve

    e "Hi Kyousuke."

    b "Hi Mio, long time no see"
    
    e " Yeah since last year"
    
    b "Going to do the shores of the class?"
    
    e "Yeah i need to finish the cleaning of it."

# Esta es la primera seleccion de opciones del juego    
menu:
    "Offer to help her to clean":
         jump offer
    
    "Say goodbye":
      jump goodbye2


#Esto son los resultados de las opciones
label goodbye2:
    
    b "Ok I need to go home."
    
    b "See you tomorrow."
    
    e "Ok, see you tomorrow."
    
    scene black
    
    "....Ending..."
    
    return
      
label offer:
    
    scene bg Clase
    with zoomin
    
    show Mio
    
    e "Thanks for helping me to finish cleaning."
    
    b "Your Welcome"
    
    e "I was thinking we could go home together.
       What do you say?"
    
menu:
    "...Acompany her home":
         jump accompany
         
    "... Say no":
       jump no

label accompany:
    
    b "Ok, we should start going before it gets late"
    
    e "Ok just let me get my bag and we can go."
     
    show bg lake
    with fade
    
    b "I take this road.
       See you tomorrow."
    
    hide Mio

    e "She's so cute. Mabye I should ask her on a date, but I'm not really sure"
    
menu:
    
    "...Ask her on a date":
        jump date 
    
    "Just say goodbye":
        jump goodbye
    
label date:
    
    e "Mio wait!"
    
    show Mio
    with fade
    
    b "Yes?"
    
    e "I was thinking that.... \nThat we could go on a date tomorrow? What do you think?"
    
    b "Yeah sure, \nI wanted to ask you the same thing but i couldn't"
    
    e "See you in the mall tomorrow?"
    
    b "Yeah, see you tomorrow"
    
    scene black 
    with fade 
    
    "So we went on the date and finally we became a couple. \nEven we continued during university
     Till we got married."
    
    "....Good Ending...."
    
    return

label goodbye :
    
    e " Bye, then."
    
    e "See you at school"
    
    b "Ok bye."
    
    "After that we continued as friends till we ended highschool\n"
    "Then we got separated ways on college and I didn't talked to her again."
    
    "..Bad ending.."
    
    return 

label no:
    
    scene black
    
    "After leaving school i recieved a call from Rika"
    "A classmate from school"
    "She said she needed help, but didn't say with what."
    "So I went to her house to help her."
    
    show Rika

    a "Hi Kyouske, how are you?"
    
    e "I'm fine, and u?"
    
    a "I'm good just stressed"
    
menu:
    "... Why stressed?":
        jump why
        
    "... Oh ok.":
        jump ok
        
        
label why:

    a "I need to study for this test."
        
    a "But I can't concentrate at all."
    
    e "Can i help you at anything?"
    
    a "Yeah\nCan you explain me this prolem?"
    
    e "Let me see what I can do."
    
    "...................."
    
    e "I got it you just have to move this here and then....."
    
    a "I get it thanks."
    
    "After that we continued studying and at the end we became really good friends."
    
    "......Good Ending....."
        
    return
   
label ok:
    e " Oh ok."
    
    a " yeah..."
        
    e "Ok see ya later."
        
    return
    