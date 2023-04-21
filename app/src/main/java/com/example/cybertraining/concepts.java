package com.example.cybertraining;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class concepts extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    String[] names = {"Please Select a Security Concept",
    "DRM",
    "Password storing and salts",
    "Obfuscation and Steganography",
    "Secure Transactions",
    "two-factor authentication",
    "disk encryption",
    "encryption of communication data",
    "Legal and ethical issues of the storage and encryption of data",
    "Computational hardness assumption",
    "Shift ciphers",
    "Hash functions (e.g. MD4, MD5, SHA-2 SHA-3)",
    "Symmetric key encryption",
    "Public key encryption",
    "HTTPS protocol",
    "virtual private networks (VPNs)"};


    String[] definitions = {"Please select a Security Concept",
    "As the music, videos and games are nowadays sold or downloaded illegally, there is this method to protect the system. \n" +
            "This type of encryption is used to encrypt the media and then the key for decryption is provided only to people who purchased the products inside the store or online. \n" +
            "For example, the antivirus software could be fully used only if the person has the licence (key).\n",
    "In order to store passwords on the system, it is encrypted to keep it secure from hackers. \n" +
            "In case the attacker knows the decryption key, he can access the whole system password file. \n" +
            "Then he just needs to match the list of the password to the password of a specific file.\n" +
            "Salts are used to make the password more strong and more difficult to hack. \n" +
            "This is just a randomly generated key that will never match with the attacker’s password file.\n",
    "Software Obfuscation is a method that makes something more difficult to understand. \n" +
            "This makes the hacker more difficult to retrieve/find data because it is hidden. \n" +
            "\n" +
            "Stenography is a method to hide data within images. This method is used to send data over the internet and to be secure so that stolen data could not be seen by hackers. \n" +
            "\n",
    "This method makes sure the sent financial data which is sensible is secure. Otherwise third parties could intercept them. \n" +
            "This method acts like the internet communication protocol. Digital signature and digital certificate are used to check the transactions by the purchaser bank. \n",
    "Two-factor authentication is a way to access the data by using two types of authentication. \n" +
            "This could be a PIN number which is known by the user and another external device which is connected to the company’s system. \n" +
            "For example, Barclays uses card readers to get access to the online banking and the user has to insert the password. \n",
    "The hackers to bypass the disk security removes it from the original computer and connect it to a different computer. By this way the data can be accessed by others. \n" +
            "To prevent this the operating system has an encryption system to secure files and folder. \n" +
            "Files and folders can be encrypted with the user account. This means that only the authorised person is able to access the file trough the key that only he knows. \n",
    "Conversations over the telephone are normally encrypted to make sure third parties don’t hack and listen over the line. \n" +
            "This is useful to the general public to keep privacy, but this is also a disadvantage as sometimes even the police can’t decrypt the conversation of criminals. \n",
    "Criminals and hackers can use encryption to hide their conversation or data from the police. \n" +
            "Encryption is only allowed for some purposes which are beneficial for the companies. \n" +
            "In case it is used in wrong way there would be legal and ethical issues. \n",
    "Cryptography methods rely on the fact that it would take long time before someone crack the encryption. For example, Windows 10 is more difficult to crack as it contains the latest security patch. Hacker would not bother to crack this system. However, windows 7 is more vulnerable because it is not updated.With the time passing the security methods are getting breakable and hackers always try a way to bypass the encryption methods.\n",
            "This is a simple method where we substitute one letter of the alphabet with another. \n" +
                    "Letters could be shifted by a set number. \n" +
                    "For example, SECURITY would become UGEWTKVA (shifted by 2).\n" +
                    "This method is very easy to crack as the key can be easily guessed. \n",
    "This method ensure it is not altered in any way during transmission. \n" +
            "This function takes an input of variable length and returns a fixed-length value. (MD4)\n" +
            "The advantage is that is very difficult to reverse, and it doesn’t generate duplicated values. \n" +
            "MD5 is the latest version which is more secure but slower than MD4.\n" +
            "SHA2 and SHA3 are currently used in SSL language (website protection) and application. \n",

    "In symmetric key encryption the same key is used to both encrypt and decrypt the data.\n" +
            "This is effective to secure software application but is not effective to send securely data to someone. \n",

    "This method consists in generating a pair of keys where one is public, and one is private. \n" +
            "The public key is private, but the private key is kept secure. \n" +
            "The purpose of the public key is to encrypt messages and the private key is owned only by the receiver to decrypt the message.\n",

    "The hyper text transfer protocol is a version of HTTP which is more secure. \n" +
            "This allow the users (customers) to make transactions safe on the website because the communication between the browser and the website are encrypted.\n" +
            "In case a website does not use HTTPS, the user who share sensible information is exposed to risks such as hackers could steal data as they can see all the data typed in. \n",

    "The VPN ensures data that is traveling through the network is encrypted. This means that external people cannot see where the data is coming from and going to. \n" +
            "It also allows the user to access the organization’s LAN when they are connected remotely. \n" +
            "By this, employees can freely work from their homes from their computers/laptop and access their files/folders.\n",
    };

    Spinner sp;
    TextView definition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

        sp = (Spinner) findViewById(R.id.spinner);
        definition = (TextView) findViewById(R.id.definitions);

        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,names);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        definition.setText(definitions [i]);
                        break;
                    case 1:
                        definition.setText( definitions [i]);
                        break;
                    case 2:
                        definition.setText( definitions [i]);
                        break;
                    case 3:
                        definition.setText( definitions [i]);
                        break;
                    case 4:
                        definition.setText( definitions [i]);
                        break;
                    case 5:
                        definition.setText( definitions [i]);
                        break;
                    case 6:
                        definition.setText( definitions [i]);
                        break;
                    case 7:
                        definition.setText( definitions [i]);
                        break;
                    case 8:
                        definition.setText( definitions [i]);
                        break;
                    case 9:
                        definition.setText( definitions [i]);
                        break;
                    case 10:
                        definition.setText( definitions [i]);
                        break;
                    case 11:
                        definition.setText( definitions [i]);
                        break;
                    case 12:
                        definition.setText( definitions [i]);
                        break;
                    case 13:
                        definition.setText( definitions [i]);
                        break;
                    case 14:
                        definition.setText( definitions [i]);
                        break;
                    case 15:
                        definition.setText( definitions [i]);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //set up buttons
        Button button1 = (Button)findViewById(R.id.back);

//create event handler
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
