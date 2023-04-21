package com.example.cybertraining;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class methods extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    String[] names = {"Please Select a Security Topic",
            "Security Principles",
            "Authentication",
            "Access control",
            "Cryptography",
            "Encryption Algorithms, e.g. RSA, DES, 3DES",
            "Malicious codes - Malware",
            "Web Attacks",
            "Email Attacks",
            "Wireless Security Network",
            "Denial of service",
            "Intrusion Detection and Prevention System",
            "Integrity of Database"};

    String[] definitions = {"Please select a Method",
            "There are three security principles to protect. These three aspects, confidentiality, integrity, and availability, make your computer\n" +
                    "valuable to you. But viewed from another perspective, they are three possible ways to\n" +
                    "make it less valuable, that is, to cause you harm. If someone steals your computer,\n" +
                    "scrambles data on your disk, or looks at your private data files, the value of your computer\n" +
                    "has been diminished or your computer use has been harmed. These characteristics are both\n" +
                    "basic security properties and the objects of security threats.\n" +
                    "We can define these three properties as follows.\n" +
                    "• availability: the ability of a system to ensure that an asset can be used by any\n" +
                    "authorized parties\n" +
                    "• integrity: the ability of a system to ensure that an asset is modified only by\n" +
                    "authorized parties\n" +
                    "• confidentiality: the ability of a system to ensure that an asset is viewed only\n" +
                    "by authorized parties\n ",
            "• Authentication is the act of proving that asserted identity: that the person is\n" +
                    "who she says she is. \n"+
            "Combining authentication information is called multifactor authentication. Two forms\n" +
                    "of authentication (which is, not surprisingly, known as two-factor authentication) are" +
                    "presumed to be better than one, assuming of course that the two forms are strong. But as" +
                    "the number of forms increases, so also does the user’s inconvenience. Each authentication" +
                    "factor requires the system and its administrators and the users to manage more security" +
                    "information. We assume that more factors imply higher confidence, although few studies" +
                    "support that assumption. And two kinds of authentication imply two pieces of software" +
                    "and perhaps two kinds of readers, as well as the time to perform two authentications.",
            "Access control: limiting who can access what in what ways. The main models of access control are the following:\n" +
                    "\n" +
                    "Mandatory access control (MAC). This is a security model in which access rights are regulated by a central authority based on multiple levels of security. Often used in government and military environments, classifications are assigned to system resources and the operating system or security kernel. MAC grants or denies access to resource objects based on the information security clearance of the user or device. For example, Security-Enhanced Linux is an implementation of MAC on Linux.\n" +
                    "Discretionary access control (DAC). This is an access control method in which owners or administrators of the protected system, data or resource set the policies defining who or what is authorized to access the resource. Many of these systems enable administrators to limit the propagation of access rights. A common criticism of DAC systems is a lack of centralized control.\n" +
                    "Role-based access control (RBAC). This is a widely used access control mechanism that restricts access to computer resources based on individuals or groups with defined business functions -- e.g., executive level, engineer level 1, etc. -- rather than the identities of individual users. The role-based security model relies on a complex structure of role assignments, role authorizations and role permissions developed using role engineering to regulate employee access to systems. RBAC systems can be used to enforce MAC and DAC frameworks.\n" +
                    "Rule-based access control. This is a security model in which the system administrator defines the rules that govern access to resource objects. These rules are often based on conditions, such as time of day or location. It is not uncommon to use some form of both rule-based access control and RBAC to enforce access policies and procedures.\n" +
                    "Attribute-based access control. This is a methodology that manages access rights by evaluating a set of rules, policies and relationships using the attributes of users, systems and environmental conditions.",
            "Cryptography conceals data against unauthorized access. One important aspect of the encryption process is that it almost always involves both an algorithm and a key. A key is just another piece of information, almost always a number, that specifies how the algorithm is applied to the plaintext in order to encrypt it. In a secure cryptographic system, even if you know the method by which some message is encrypted, it should be difficult or impossible to decrypt without that key. Keep algorithms and keys in your mind, because they'll be important as we move on. \n" +
            "Using cryptographic techniques, security pros can:\n" +
                    "\n" +
                    "Keep the contents of data confidential\n" +
                    "Authenticate the identity of a message's sender and receiver\n" +
                    "Ensure the integrity of the data, showing that it hasn't been altered\n" +
                    "Demonstrate that the supposed sender really sent this message, a principle known as non-repudiation",
            "The RSA is a secure method of encryption as it uses different keys to encrypt and decrypt data. \n" +
                    "This is secure because if the hacker intercepts the sender key, he would never get access with the same key. \n" +
                    "DES is a weaker method that RSA because it uses the same key for encryption and decryption. \n" +
                    "3DES combine three instances of it together with distinct keys. This is more secure that DES as it 3 times secure but 3 times slower.",
            "The malware may have" +
                    "been caused by a worm or a virus or neither; the infection metaphor often seems apt, but" +
                    "the terminology of malicious code is sometimes used imprecisely. Here we distinguish" +
                    "names applied to certain types of malware, but you should focus on methods and impacts," +
                    "instead of names. That which we call a virus by any other name would smell as vile.\n" +
                    "A virus is a program that can replicate itself and pass on malicious code to other" +
                    "nonmalicious programs by modifying them. The term “virus” was coined because the" +
                    "affected program acts like a biological virus: It infects other healthy subjects by attaching" +
                    "itself to the program and either destroying the program or coexisting with it. Because" +
                    "viruses are insidious, we cannot assume that a clean program yesterday is still clean today. \n"+
            "A worm is a program that spreads copies of itself through a network.\n" +
            "A bot (short for robot), is a kind of worm used in vast" +
                    "numbers by search engine hosts like Bing and Google.",
            "Web sites are easy to fake because the attacker can obtain copies of the images the real" +
                    "site uses to generate its web site. All the attacker has to do is change the values of links to" +
                    "redirect the unsuspecting victim to points of the attacker’s choosing." +
                    "The attacker can get all the images a real site uses; fake sites can look convincing.\n"+
            "A web site is meant to be accessed by clients. Although some web sites are intended for" +
                    "authorized clients only and restricted by passwords or other access controls, other sites are" +
                    "intended for the general public. Thus, any controls on content have to be unobtrusive, not" +
                    "limiting proper use by the vast majority of users." +
                    "Our favorite integrity control, encryption, is often inappropriate: Distributing decryption" +
                    "keys to all users defeats the effectiveness of encryption. However, two uses of encryption" +
                    "can help keep a site’s content intact.",
            "Given the huge amount of email sent and received daily, it is not surprising that much of\n" +
                    "it is not legitimate. Some frauds are easy to spot, as our first example shows, but some\n" +
                    "illegitimate email can fool professionals, as in our second example.\n"+
            "Attackers using fake email" +
                    "know most people will spot the forgery. On the other hand, it costs next to nothing to send" +
                    "100,000 messages, and even if the response rate is only 0.1%, that is still 100 potential" +
                    "victims.",
            "Wi-Fi security is the protection of devices and networks connected in a wireless environment. Without Wi-Fi security, a networking device such as a wireless access point or a router can be accessed by anyone using a computer or mobile device within range of the router's wireless signal.\n"+
            "One basic best practice for Wi-Fi security is to change default passwords for network devices.\n" +
                    "Most devices feature default administrator passwords, which are meant to make setup of the devices easy. However, the default passwords created by device manufacturers can be easy to obtain online.\n" +
                    "Changing the default passwords for network devices to more-complex passwords—and changing them often—are simple but effective ways to improve Wi-Fi security.",
            "A Denial-of-Service (DoS) attack is an attack meant to shut down a machine or network, making it inaccessible to its intended users. DoS attacks accomplish this by flooding the target with traffic, or sending it information that triggers a crash. In both instances, the DoS attack deprives legitimate users (i.e. employees, members, or account holders) of the service or resource they expected.\n" +
                    "\n" +
                    "Victims of DoS attacks often target web servers of high-profile organizations such as banking, commerce, and media companies, or government and trade organizations. Though DoS attacks do not typically result in the theft or loss of significant information or other assets, they can cost the victim a great deal of time and money to handle.\n" +
            "Popular flood attacks include:\n" +
                    "\n" +
                    "Buffer overflow attacks – the most common DoS attack. The concept is to send more traffic to a network address than the programmers have built the system to handle. It includes the attacks listed below, in addition to others that are designed to exploit bugs specific to certain applications or networks\n" +
                    "ICMP flood – leverages misconfigured network devices by sending spoofed packets that ping every computer on the targeted network, instead of just one specific machine. The network is then triggered to amplify the traffic. This attack is also known as the smurf attack or ping of death.\n" +
                    "SYN flood – sends a request to connect to a server, but never completes the handshake. Continues until all open ports are saturated with requests and none are available for legitimate users to connect to.",
            "Intrusion detection and prevention are two broad terms describing application security practices used to mitigate attacks and block new threats.\n" +
                    "\n" +
                    "The first is a reactive measure that identifies and mitigates ongoing attacks using an intrusion detection system. It’s able to weed out existing malware (e.g., Trojans, backdoors, rootkits) and detect social engineering (e.g., man in the middle, phishing) assaults that manipulate users into revealing sensitive information.\n" +
                    "\n" +
                    "The second is a proactive security measure that uses an intrusion prevention system to preemptively block application attacks. This includes remote file inclusions that facilitate malware injections, and SQL injections used to access an enterprise’s databases.",
            "Data integrity refers to the overall accuracy, completeness, and reliability of data. It can be specified by the lack of variation between two instances or consecutive updates of a record, indicating that your information is error-free. It also corresponds to the security and integrity controls and methods of regulatory compliance.\n" +
                    "\n" +
                    "Data integrity in a database is preserved by an array of error-checking and validation procedures, rules, and principles executed during the integration flow designing phase. These checks and correction procedures are based on predefined business rules. For instance, the rules dictate to filter out the data with an incorrect date or time value.\n" +
            "Several factors impact the integrity of the data stored in a database, including:\n" +
                    "\n" +
                    "Human Errors\n" +
                    "Manual data entry increases the chances of errors, duplications, or deletion. Often, the entered data fails to follow the apt protocol, or the mistakes in the manual entry can extend to the execution of processes, hence corrupting the results. All these issues put data integrity at risk.\n" +
                    "\n" +
                    "Transfer Errors\n" +
                    "A transfer error occurs if the data is not successfully transferred from one site within a database to another. These errors usually occur when a data item exists in the target table but is absent from the source table within a relational database.\n" +
                    "\n" +
                    "Bugs and Viruses\n" +
                    "Your data’s integrity can also be compromised due to spyware, malware, and viruses invading a computer and altering, deleting, or stealing data."
            };

    Spinner sp;
    TextView definition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

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

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //set up buttons
        Button button1 = (Button) findViewById(R.id.back);

//create event handler
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
