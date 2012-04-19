/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 13/04/12
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class AcceptanceTestM3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        {
            System.out.println ("simple test...");
            // test from wikipedia enigma page
            EnigmaMachine m3 = EnigmaBuilder.constructM3 ("123B");
            String plainText  = "AAAAA";
            String cipherText = "BDZGO";
            m3.setIndicators ("AAA");
            assert (m3.encipher (plainText).equals (cipherText));
        }

        {
            System.out.println ("longer test...");
            // test from http://enigmaco.de/enigma/enigma.html
            EnigmaMachine m3 = EnigmaBuilder.constructM3 ("123B");

            String plainText  = "WHEREEVERYOUGOTHEREYOUAREWHEREEVERYOUGOTHEREYOUAREWHEREEVERYOUGOTHEREYOUAREWHEREEVERYOUGOTHEREYOUAREWHEREEVERYOUGOTHEREYOUAREWHEREEVERYOUGOTHEREYOUARE";
            String cipherText = "KPCURNSYDGLDHCUGTOOMLAQGCDQKHOUMRBNBFXDEKUIKBCJHKVPEGLYXBTKFFATZEYYLTNFQGLDSQXOYKUHSGPLVNJTWCZXXKEFBBZGHPLHKVGIFBPLRSVSQYOIXTNEGPMNPBGVDXYHMUNUUDYYLZX";

            m3.setIndicators ("AAA");
            assert (m3.encipher (plainText).equals (cipherText));
        }


        {
            System.out.println ("\"YUCK FIX\" test...");

            // test validated at http://enigmaco.de/enigma/enigma.html
            EnigmaMachine m3 = EnigmaBuilder.constructM3 ("451B");
            String cipherText = "BTNJJFJGELCFIPFTLANTCABHGKDFCJWYMPKTFRLWOIQHLBXZCYSBFTIJREAJWHHWQUVLIEVYBANINWFKQYMYRELWPHEYWNSOZCRKIFNDGCNGDQLVTQEWHITLYCNLGCLTJGDLPPWXMTZHNYSLNYMGVOWJQMYEOJAIXYINDUWFGEEIQGXRXKYFMQNLCTQVJEFVGPKUNOXMTMKNJQGGIIKAJZIEHUPVVGZVTNCMSQSWMATLOORQDOXASDTCFBSQDQJPXUCUWTVJEYPNDMGUBBLSRXBINNVOUZZGZRFSCATQWKMCVRBYLEHGVPFXIINZRLMNOWFONLDUGPPQNVNQFTYPIEOCMCXFFQWHNKYTWHFBOFZGQQBYSPNWWSHGULJYFZYBHJAPOQREBQIONTDFFGRWLHHAOLMEJBBZSPXTKDNQYDRFKTGIDVZKPLJZUDELBWQGTURXWJJHCJYXVEMXIQZNAPPDLQKEEBDTGYVBNCNUFKWYFFNETMZLJRBASQTTSTQJTTYQFBLXSGOJXRIXAFCYXMCPBMZQNHHRQTOWIYAMVUGVJGMIGVEWJOTAYXGOLQQCRCQOYCMGZMSSLCLEBMSBIAJKYBLCHCDPYGLPLCKGXTXMKIAKXQWFHYLCGBFGYTQWIKSKOHYHPBJRYBJYAIFGAMGYEMLYOQZONCGXDQSZZIHPQFYXYRTOFOCUVAVEOPXLJUZUXTJUWWDMRDZZAHGTTLNAYCSLVLOFRYYZEDBNPRCIHBYTNVBWYQKJQMEMBJSTLXRDQQFXQBTDMQURKFPYSFQRXIWBZUEALOKHWKCFACIIDVMJVZEZECZYPGNTFZBYMFBEWOPLKKLPZQXGCDIMPMBSVDIUDRRJRBMODKYKHVBOYLMYHOVEMBTVIALAAEFFIAXTHVCMLOFWPVVILTXTAMCSLEBMPDMZMPSPNZVVYFMIXQAPKXRTLVFVUBQULGNJYTXXUWZZOORJQXMMRTSUVJJKYUCKFIXOTOPTQZQQXSYMUBSCHGGELPFZNQSZOYZSLQKWP";
            String plainText = "OURFORMOFGOVERNMENTDOESNOTENTERINTORIVALRYWITHTHEINSTITUTIONSOFOTHERSOURGOVERNMENTDOESNOTCOPYOURNEIGHBORSBUTISANEXAMPLETOTHEMITISTRUETHATWEARECALLEDADEMOCRACYFORTHEADMINISTRATIONISINTHEHANDSOFTHEMANYANDNOTOFTHEFEWBUTWHILETHEREEXISTSEQUALJUSTICETOALLANDALIKEINTHEIRPRIVATEDISPUTESTHECLAIMOFEXCELLENCEISALSORECOGNIZEDANDWHENACITIZENISINANYWAYDISTINGUISHEDHEISPREFERREDTOTHEPUBLICSERVICENOTASAMATTEROFPRIVILEGEBUTASTHEREWARDOFMERITNEITHERISPOVERTYANOBSTACLEBUTAMANMAYBENEFITHISCOUNTRYWHATEVERTHEOBSCURITYOFHISCONDITIONTHEREISNOEXCLUSIVENESSINOURPUBLICLIFEANDINOURPRIVATEBUSINESSWEARENOTSUSPICIOUSOFONEANOTHERNORANGRYWITHOURNEIGHBORIFHEDOESWHATHELIKESWEDONOTPUTONSOURLOOKSATHIMWHICHTHOUGHHARMLESSARENOTPLEASANTWHILEWEARETHUSUNCONSTRAINEDINOURPRIVATEBUSINESSASPIRITOFREVERENCEPERVADESOURPUBLICACTSWEAREPREVENTEDFROMDOINGWRONGBYRESPECTFORTHEAUTHORITIESANDFORTHELAWSHAVINGAPARTICULARREGARDTOTHOSEWHICHAREORDAINEDFORTHEPROTECTIONOFTHEINJUREDASWELLASTHOSEUNWRITTENLAWSWHICHBRINGUPONTHETRANSGRESSOROFTHEMTHEREPROBATIONOFTHEGENERALSENTIMENT";
            m3.setIndicators ("IYP");
            assert (m3.encipher (cipherText).equals (plainText));
        }
        System.out.println ("All tests passed.  You are Awesome!");
    }
}