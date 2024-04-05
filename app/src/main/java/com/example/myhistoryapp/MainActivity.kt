package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //list of information of famous people 
    enum class InformationOfFamousPerson(val age: Int, val description: String, ) {
        Person_1(20, "Millie Bobby Brown  who is a British actress "),
        Person_2(21, "Jenna Ortega age 21 who is American actor she's well known For playing Wednesday in the Netflix series"),
        Person_3(22, "Billie Eilish age 22 who is an American singer and songwriter who's well Known for her breakthrough Bad Guy"),
        Person_4(23, "Joshua Bassett age 23 who is and American actor and singer and is well Know for playing ricky in High School Musical"),
        Person_5(24, "Joey King age 24 who is an American actress"),
        Person_6(25, "Mr Beast age 25 who is an American YouTuber"),
        Person_7(26, "Sydney Sweeney age 26 who is an American actress well known for her role in Euphoria"),
        Person_8(27, "Tom Holland age 27 who is an English actor well known for playing Spider-Man"),
        Person_9(28, "Timothée Chalamet age 28 who is an American and French actor well known for his role in Dune"),
        Person_10(29, "Camila Mendes age 29 who is an American actress and is well known for her role in Riverdale"),
        Person_11(30, "Harry Styles age 30 who is an English singer and was apart of One Direction before they broke up"),
        Person_12(31, "Selena Gomez age 31 who is an American singer, songwriter, actress, producer, and businesswoman"),
        Person_13(32, "Bruce Lee age 32 who was a Hong Kong-American martial artist and actor"),
        Person_14(33, "Jesus Christ age 33 who is our Lord and Saviour and is God"),
        Person_15(34, "Taylor Swift age 34 who is an American singer-songwriter and is well known for her song shake it off"),
        Person_16(35, "Adele age 35 who is an English singer-songwriter"),
        Person_17(36, "Lionel Messi age 36 who is an Argentine professional footballer"),
        Person_18(37, "Drake age 37 who is a Canadian rapper and singer"),
        Person_19(38, "Cristiano Ronaldo age 38 who is a Portuguese professional footballer"),
        Person_20(39, "Mark Zuckerberg age 39 who is an American businessman and philanthropist and his the Ceo of Facebook"),
        Person_21(40, "John Lennon age 40 who was an English singer, songwriter and musician and was the leader singer Beatles"),
        Person_22(41, "Emily Blunt age 41 who is a British actress and was the highest paid model in 2020"),
        Person_23(42, "Chris Evans age 42 who is an American actor and is well known for playing Captain America"),
        Person_24(43, "Ryan Gosling age 43 who is a Canadian actor"),
        Person_25(44, "Kevin Heart age 44 who is an American comedian and actor"),
        Person_26(45, "Adam Levine age 45 who is an American singer and musician who serves as the lead singer in the band Maroon 5"),
        Person_27(46, "Kenya West age 46 who is an American rapper, record producer, singer, songwriter, and fashion designer"),
        Person_28(47, "Ryan Reynolds age 47 who is an American and Canadian actor, producer and businessman and is well know for playing DeadPool"),
        Person_29(48, "David Beckham age 48 who is an English former professional footballer and is the president and co-owner of Inter Miami"),
        Person_30(49, "Leonardo Dicaprio age 49 who is an American actor and film producer and is known for playing Jack in Titanic"),
        Person_31(50, "Micheal Jackson age 50 who was an American singer, songwriter, dancer and philanthropist and is known is the King of Pop"),
        Person_32(51, "Eminem age 51 who is an American rapper and is one of the greatest rapper of all time"),
        Person_33(52, "Elon Musk age 52 who is an Businessman and investor and he is the richest man in the world"),
        Person_34(53, "Ethan Hawk age 53 who is an American actor, author and film director"),
        Person_35(54, "Paul Rudd age 54 who is an American actor and comedian and is well known for playing Ant-Man"),
        Person_36(55, "Hugh Jackman age 55 who is an Australian actor and is well known for playing Wolverine"),
        Person_37(56, "Steve Jobs age 56 who was an American businessman, inventor and investor best known for co-founding the technology giant Apple"),
        Person_38(57, "Gordan Ramsay 57 who is a British celebrity chef, restaurateur, television presenter, and writer"),
        Person_39(58, "Robert Downy Jr Age 58 who is an American actor and is well known for playing Iron Man"),
        Person_40(59, "Keanu Reeves age 59 who is a Canadian actor and musician and well known for playing John Wick"),
        Person_41(60, "Jeff Bezos age 60 who is an American businessman, media proprietor and investor and he is the founder of Amazon"),
        Person_42(61, "Micheal Jordan age 61 who is an American businessman and former professional basketball player"),
        Person_43(62, "Barack Obama age 62 who is an American politician who served as th 44th president of the United States and was the first African-American president"),
        Person_44(63, "Tom cook age 63 is who an American businessman who is the Ceo of Apple"),
        Person_45(64, "Tony Robbins age 64 who is an American author, coach and speaker and his well known for his self help books"),
        Person_46(65, "Kevin Bacon age 65 who is an American actor and is well known for his role in Footloose"),
        Person_47(66, "Mukesh Ambani age 66 who is an Indian businessman and is the Richest person in Asia"),
        Person_48(67, "Leonardo da Vinci 67 who was an Italian polymath of the High Renaissance who is well know fro paining the Monalisa"),
        Person_49(68, "Bill Gates age 68 who is an American Businessman, investor, philanthropist and is the co-founder of Microsoft"),
        Person_50(69, "Jackie Chan age 69 who is a Wong Kong actor, director, writer, produce and martial artist"),
        Person_51(70, "Oprah Winfrey age 70 who is an American Talk show host television producer, actress, author and media proprietor"),
        Person_52(71, "Vladimir Putin age 71 who is the President of Russia"),
        Person_53(72, "Micheal Keaton age 72 who is an american actor and is well Known for play Batman"),
        Person_54(73, "Bill Murray age 73 who is an American actor and comedian "),
        Person_55(74, "Muhammad Ali age 74 who was an American professional boxer and activist and is the Greatest boxer "),
        Person_56(75, "Samuel L. Jackson age 75 who is an American actor and is well know for playing Nick Fury "),
        Person_57(76, "Albert Einstein age 76 who was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time"),
        Person_58(77, "Donald Trump age 77 who is an American politician and businessman who served as the 45th president of the United States"),
        Person_59(78, "Mahatma Gandhi age 78 who was and Indian lawyer, anti-colonial nationalist and political ethicist"),
        Person_60(79, "Micheal douglas age 79 who is an American actor and film producer"),
        Person_61(80, "Ben Kingsley age 80 who is an English actor"),
        Person_62(81, "Joe Biden age 81 who is an American politician who is the 46th and current president of the United States"),
        Person_63(82, "Neil Armstrong age 82 who was anAmerican astronaut and aeronautical engineer who is the first person to walk on the Moon"),
        Person_64(83, "Patrick Stewart age 83 who is an English actor who is well known for playing Professor X"),
        Person_65(84, "Thomas Edison age 84 who was an American inventor and businessman and is the inventor of the Light"),
        Person_66(85, "James Madison age 85 who was an American statesman, diplomat, and Founding Father who served as the 4th president of the United States"),
        Person_67(86, "Morgan Freeman age 86 who is an American actor, producer and narrator"),
        Person_68(87, "Pope Francis age 87 who is the Pope and head of the Catholic Church"),
        Person_69(88, "Salman age 88 who has been King of Saudi Arabia since 2015 and was Prime Minister of Saudi Arabia from 2015 to 2022"),
        Person_70(89, "Maggie Smith age 89 who is an English actress"),
        Person_71(90, "Enzo Ferrari age 90 who was an Italian motor racing driver and entrepreneur and is the founder of Ferrari "),
        Person_72(91, "Christopher Plummer who age 91 was a Canadian actor"),
        Person_73(92, "Andrew Young age 92 who is an American politician, diplomat and activist"),
        Person_74(93, "Ronald Reagan age 93 who was an American politician and actor who served as the 40th president of the United States from 1981 to 1989"),
        Person_75(94, "Buzz Aldrin age 94 who is an American former astronaut, engineer and fighter pilot and he made 3 space walks"),
        Person_76(95, "Nelson Mandela age 95 who was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa"),
        Person_77(96, "Queen Elizabeth II age 96 who of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022"),
        Person_78(97, "John D. Rockefeller age 97 who was an American business magnate and philanthropist and he was one of the wealthiest American of all time and one of the richest people in modern history "),
        Person_79(98, "Dick Van Dyke age 98 who is an american actor and comedian"),
        Person_80(99, "Billy Graham age 99 who was an American evangelist whose broadcast and live sermons became well known internationally in the mid-to-late 20th century"),
        Person_81(100, "Glynis Johns age 100 who was a British actress"),

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextText = findViewById<EditText>(R.id.editTextText2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val result = findViewById<TextView>(R.id.textView3)

        //if the user presses the Generate button
        button1?.setOnClickListener()
        {
            val currentAge = editTextText.text.toString().toInt()

            if (currentAge != null && currentAge in 20..100) {
                // Grabbing the values of the ages in the list of information of famous person
                val personAges = InformationOfFamousPerson.values().map { it.age}

                val persons = when (currentAge)
                {
                    //This statement will run if the current age matches exactly
                    in personAges -> {
                        val person = InformationOfFamousPerson.values().find {it.age == currentAge }
                        listOf("Your the same age as ${person?.description ?: "person"}")
                    }
                    // This statement will be run if the current age is not the same
                    else -> listOf("No famous person has been found who is age $currentAge please input age from 20 to 100.")
                }
                result.text = persons.joinToString("\n")
            } else {
                result.text = "No famous person has been found with your current age please enter age from 20-100 ."
            }
        }

        // If user presses the Clear button
        button2?.setOnClickListener() {
            editTextText.text.clear()
            result.text = ""
        }
    }
}
