package task6.hasmukhi.admin.task6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    String myJSONString = "[\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 1,\n" +
            "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
            "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 2,\n" +
            "    \"title\": \"qui est esse\",\n" +
            "    \"body\": \"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 3,\n" +
            "    \"title\": \"ea molestias quasi exercitationem repellat qui ipsa sit aut\",\n" +
            "    \"body\": \"et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 4,\n" +
            "    \"title\": \"eum et est occaecati\",\n" +
            "    \"body\": \"ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 5,\n" +
            "    \"title\": \"nesciunt quas odio\",\n" +
            "    \"body\": \"repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed est\\nvoluptatem omnis possimus esse voluptatibus quis\\nest aut tenetur dolor neque\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 6,\n" +
            "    \"title\": \"dolorem eum magni eos aperiam quia\",\n" +
            "    \"body\": \"ut aspernatur corporis harum nihil quis provident sequi\\nmollitia nobis aliquid molestiae\\nperspiciatis et ea nemo ab reprehenderit accusantium quas\\nvoluptate dolores velit et doloremque molestiae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 7,\n" +
            "    \"title\": \"magnam facilis autem\",\n" +
            "    \"body\": \"dolore placeat quibusdam ea quo vitae\\nmagni quis enim qui quis quo nemo aut saepe\\nquidem repellat excepturi ut quia\\nsunt ut sequi eos ea sed quas\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 8,\n" +
            "    \"title\": \"dolorem dolore est ipsam\",\n" +
            "    \"body\": \"dignissimos aperiam dolorem qui eum\\nfacilis quibusdam animi sint suscipit qui sint possimus cum\\nquaerat magni maiores excepturi\\nipsam ut commodi dolor voluptatum modi aut vitae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 9,\n" +
            "    \"title\": \"nesciunt iure omnis dolorem tempora et accusantium\",\n" +
            "    \"body\": \"consectetur animi nesciunt iure dolore\\nenim quia ad\\nveniam autem ut quam aut nobis\\net est aut quod aut provident voluptas autem voluptas\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 10,\n" +
            "    \"title\": \"optio molestias id quia eum\",\n" +
            "    \"body\": \"quo et expedita modi cum officia vel magni\\ndoloribus qui repudiandae\\nvero nisi sit\\nquos veniam quod sed accusamus veritatis error\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 11,\n" +
            "    \"title\": \"et ea vero quia laudantium autem\",\n" +
            "    \"body\": \"delectus reiciendis molestiae occaecati non minima eveniet qui voluptatibus\\naccusamus in eum beatae sit\\nvel qui neque voluptates ut commodi qui incidunt\\nut animi commodi\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 12,\n" +
            "    \"title\": \"in quibusdam tempore odit est dolorem\",\n" +
            "    \"body\": \"itaque id aut magnam\\npraesentium quia et ea odit et ea voluptas et\\nsapiente quia nihil amet occaecati quia id voluptatem\\nincidunt ea est distinctio odio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 13,\n" +
            "    \"title\": \"dolorum ut in voluptas mollitia et saepe quo animi\",\n" +
            "    \"body\": \"aut dicta possimus sint mollitia voluptas commodi quo doloremque\\niste corrupti reiciendis voluptatem eius rerum\\nsit cumque quod eligendi laborum minima\\nperferendis recusandae assumenda consectetur porro architecto ipsum ipsam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 14,\n" +
            "    \"title\": \"voluptatem eligendi optio\",\n" +
            "    \"body\": \"fuga et accusamus dolorum perferendis illo voluptas\\nnon doloremque neque facere\\nad qui dolorum molestiae beatae\\nsed aut voluptas totam sit illum\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 15,\n" +
            "    \"title\": \"eveniet quod temporibus\",\n" +
            "    \"body\": \"reprehenderit quos placeat\\nvelit minima officia dolores impedit repudiandae molestiae nam\\nvoluptas recusandae quis delectus\\nofficiis harum fugiat vitae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 16,\n" +
            "    \"title\": \"sint suscipit perspiciatis velit dolorum rerum ipsa laboriosam odio\",\n" +
            "    \"body\": \"suscipit nam nisi quo aperiam aut\\nasperiores eos fugit maiores voluptatibus quia\\nvoluptatem quis ullam qui in alias quia est\\nconsequatur magni mollitia accusamus ea nisi voluptate dicta\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 17,\n" +
            "    \"title\": \"fugit voluptas sed molestias voluptatem provident\",\n" +
            "    \"body\": \"eos voluptas et aut odit natus earum\\naspernatur fuga molestiae ullam\\ndeserunt ratione qui eos\\nqui nihil ratione nemo velit ut aut id quo\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 18,\n" +
            "    \"title\": \"voluptate et itaque vero tempora molestiae\",\n" +
            "    \"body\": \"eveniet quo quis\\nlaborum totam consequatur non dolor\\nut et est repudiandae\\nest voluptatem vel debitis et magnam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 19,\n" +
            "    \"title\": \"adipisci placeat illum aut reiciendis qui\",\n" +
            "    \"body\": \"illum quis cupiditate provident sit magnam\\nea sed aut omnis\\nveniam maiores ullam consequatur atque\\nadipisci quo iste expedita sit quos voluptas\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 2,\n" +
            "    \"id\": 20,\n" +
            "    \"title\": \"doloribus ad provident suscipit at\",\n" +
            "    \"body\": \"qui consequuntur ducimus possimus quisquam amet similique\\nsuscipit porro ipsam amet\\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\\nomnis rerum consequatur expedita quidem cumque explicabo\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 21,\n" +
            "    \"title\": \"asperiores ea ipsam voluptatibus modi minima quia sint\",\n" +
            "    \"body\": \"repellat aliquid praesentium dolorem quo\\nsed totam minus non itaque\\nnihil labore molestiae sunt dolor eveniet hic recusandae veniam\\ntempora et tenetur expedita sunt\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 22,\n" +
            "    \"title\": \"dolor sint quo a velit explicabo quia nam\",\n" +
            "    \"body\": \"eos qui et ipsum ipsam suscipit aut\\nsed omnis non odio\\nexpedita earum mollitia molestiae aut atque rem suscipit\\nnam impedit esse\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 23,\n" +
            "    \"title\": \"maxime id vitae nihil numquam\",\n" +
            "    \"body\": \"veritatis unde neque eligendi\\nquae quod architecto quo neque vitae\\nest illo sit tempora doloremque fugit quod\\net et vel beatae sequi ullam sed tenetur perspiciatis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 24,\n" +
            "    \"title\": \"autem hic labore sunt dolores incidunt\",\n" +
            "    \"body\": \"enim et ex nulla\\nomnis voluptas quia qui\\nvoluptatem consequatur numquam aliquam sunt\\ntotam recusandae id dignissimos aut sed asperiores deserunt\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 25,\n" +
            "    \"title\": \"rem alias distinctio quo quis\",\n" +
            "    \"body\": \"ullam consequatur ut\\nomnis quis sit vel consequuntur\\nipsa eligendi ipsum molestiae et omnis error nostrum\\nmolestiae illo tempore quia et distinctio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 26,\n" +
            "    \"title\": \"est et quae odit qui non\",\n" +
            "    \"body\": \"similique esse doloribus nihil accusamus\\nomnis dolorem fuga consequuntur reprehenderit fugit recusandae temporibus\\nperspiciatis cum ut laudantium\\nomnis aut molestiae vel vero\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 27,\n" +
            "    \"title\": \"quasi id et eos tenetur aut quo autem\",\n" +
            "    \"body\": \"eum sed dolores ipsam sint possimus debitis occaecati\\ndebitis qui qui et\\nut placeat enim earum aut odit facilis\\nconsequatur suscipit necessitatibus rerum sed inventore temporibus consequatur\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 28,\n" +
            "    \"title\": \"delectus ullam et corporis nulla voluptas sequi\",\n" +
            "    \"body\": \"non et quaerat ex quae ad maiores\\nmaiores recusandae totam aut blanditiis mollitia quas illo\\nut voluptatibus voluptatem\\nsimilique nostrum eum\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 29,\n" +
            "    \"title\": \"iusto eius quod necessitatibus culpa ea\",\n" +
            "    \"body\": \"odit magnam ut saepe sed non qui\\ntempora atque nihil\\naccusamus illum doloribus illo dolor\\neligendi repudiandae odit magni similique sed cum maiores\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 3,\n" +
            "    \"id\": 30,\n" +
            "    \"title\": \"a quo magni similique perferendis\",\n" +
            "    \"body\": \"alias dolor cumque\\nimpedit blanditiis non eveniet odio maxime\\nblanditiis amet eius quis tempora quia autem rem\\na provident perspiciatis quia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 31,\n" +
            "    \"title\": \"ullam ut quidem id aut vel consequuntur\",\n" +
            "    \"body\": \"debitis eius sed quibusdam non quis consectetur vitae\\nimpedit ut qui consequatur sed aut in\\nquidem sit nostrum et maiores adipisci atque\\nquaerat voluptatem adipisci repudiandae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 32,\n" +
            "    \"title\": \"doloremque illum aliquid sunt\",\n" +
            "    \"body\": \"deserunt eos nobis asperiores et hic\\nest debitis repellat molestiae optio\\nnihil ratione ut eos beatae quibusdam distinctio maiores\\nearum voluptates et aut adipisci ea maiores voluptas maxime\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 33,\n" +
            "    \"title\": \"qui explicabo molestiae dolorem\",\n" +
            "    \"body\": \"rerum ut et numquam laborum odit est sit\\nid qui sint in\\nquasi tenetur tempore aperiam et quaerat qui in\\nrerum officiis sequi cumque quod\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 34,\n" +
            "    \"title\": \"magnam ut rerum iure\",\n" +
            "    \"body\": \"ea velit perferendis earum ut voluptatem voluptate itaque iusto\\ntotam pariatur in\\nnemo voluptatem voluptatem autem magni tempora minima in\\nest distinctio qui assumenda accusamus dignissimos officia nesciunt nobis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 35,\n" +
            "    \"title\": \"id nihil consequatur molestias animi provident\",\n" +
            "    \"body\": \"nisi error delectus possimus ut eligendi vitae\\nplaceat eos harum cupiditate facilis reprehenderit voluptatem beatae\\nmodi ducimus quo illum voluptas eligendi\\net nobis quia fugit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 36,\n" +
            "    \"title\": \"fuga nam accusamus voluptas reiciendis itaque\",\n" +
            "    \"body\": \"ad mollitia et omnis minus architecto odit\\nvoluptas doloremque maxime aut non ipsa qui alias veniam\\nblanditiis culpa aut quia nihil cumque facere et occaecati\\nqui aspernatur quia eaque ut aperiam inventore\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 37,\n" +
            "    \"title\": \"provident vel ut sit ratione est\",\n" +
            "    \"body\": \"debitis et eaque non officia sed nesciunt pariatur vel\\nvoluptatem iste vero et ea\\nnumquam aut expedita ipsum nulla in\\nvoluptates omnis consequatur aut enim officiis in quam qui\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 38,\n" +
            "    \"title\": \"explicabo et eos deleniti nostrum ab id repellendus\",\n" +
            "    \"body\": \"animi esse sit aut sit nesciunt assumenda eum voluptas\\nquia voluptatibus provident quia necessitatibus ea\\nrerum repudiandae quia voluptatem delectus fugit aut id quia\\nratione optio eos iusto veniam iure\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 39,\n" +
            "    \"title\": \"eos dolorem iste accusantium est eaque quam\",\n" +
            "    \"body\": \"corporis rerum ducimus vel eum accusantium\\nmaxime aspernatur a porro possimus iste omnis\\nest in deleniti asperiores fuga aut\\nvoluptas sapiente vel dolore minus voluptatem incidunt ex\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 4,\n" +
            "    \"id\": 40,\n" +
            "    \"title\": \"enim quo cumque\",\n" +
            "    \"body\": \"ut voluptatum aliquid illo tenetur nemo sequi quo facilis\\nipsum rem optio mollitia quas\\nvoluptatem eum voluptas qui\\nunde omnis voluptatem iure quasi maxime voluptas nam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 41,\n" +
            "    \"title\": \"non est facere\",\n" +
            "    \"body\": \"molestias id nostrum\\nexcepturi molestiae dolore omnis repellendus quaerat saepe\\nconsectetur iste quaerat tenetur asperiores accusamus ex ut\\nnam quidem est ducimus sunt debitis saepe\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 42,\n" +
            "    \"title\": \"commodi ullam sint et excepturi error explicabo praesentium voluptas\",\n" +
            "    \"body\": \"odio fugit voluptatum ducimus earum autem est incidunt voluptatem\\nodit reiciendis aliquam sunt sequi nulla dolorem\\nnon facere repellendus voluptates quia\\nratione harum vitae ut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 43,\n" +
            "    \"title\": \"eligendi iste nostrum consequuntur adipisci praesentium sit beatae perferendis\",\n" +
            "    \"body\": \"similique fugit est\\nillum et dolorum harum et voluptate eaque quidem\\nexercitationem quos nam commodi possimus cum odio nihil nulla\\ndolorum exercitationem magnam ex et a et distinctio debitis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 44,\n" +
            "    \"title\": \"optio dolor molestias sit\",\n" +
            "    \"body\": \"temporibus est consectetur dolore\\net libero debitis vel velit laboriosam quia\\nipsum quibusdam qui itaque fuga rem aut\\nea et iure quam sed maxime ut distinctio quae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 45,\n" +
            "    \"title\": \"ut numquam possimus omnis eius suscipit laudantium iure\",\n" +
            "    \"body\": \"est natus reiciendis nihil possimus aut provident\\nex et dolor\\nrepellat pariatur est\\nnobis rerum repellendus dolorem autem\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 46,\n" +
            "    \"title\": \"aut quo modi neque nostrum ducimus\",\n" +
            "    \"body\": \"voluptatem quisquam iste\\nvoluptatibus natus officiis facilis dolorem\\nquis quas ipsam\\nvel et voluptatum in aliquid\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 47,\n" +
            "    \"title\": \"quibusdam cumque rem aut deserunt\",\n" +
            "    \"body\": \"voluptatem assumenda ut qui ut cupiditate aut impedit veniam\\noccaecati nemo illum voluptatem laudantium\\nmolestiae beatae rerum ea iure soluta nostrum\\neligendi et voluptate\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 48,\n" +
            "    \"title\": \"ut voluptatem illum ea doloribus itaque eos\",\n" +
            "    \"body\": \"voluptates quo voluptatem facilis iure occaecati\\nvel assumenda rerum officia et\\nillum perspiciatis ab deleniti\\nlaudantium repellat ad ut et autem reprehenderit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 49,\n" +
            "    \"title\": \"laborum non sunt aut ut assumenda perspiciatis voluptas\",\n" +
            "    \"body\": \"inventore ab sint\\nnatus fugit id nulla sequi architecto nihil quaerat\\neos tenetur in in eum veritatis non\\nquibusdam officiis aspernatur cumque aut commodi aut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 5,\n" +
            "    \"id\": 50,\n" +
            "    \"title\": \"repellendus qui recusandae incidunt voluptates tenetur qui omnis exercitationem\",\n" +
            "    \"body\": \"error suscipit maxime adipisci consequuntur recusandae\\nvoluptas eligendi et est et voluptates\\nquia distinctio ab amet quaerat molestiae et vitae\\nadipisci impedit sequi nesciunt quis consectetur\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 51,\n" +
            "    \"title\": \"soluta aliquam aperiam consequatur illo quis voluptas\",\n" +
            "    \"body\": \"sunt dolores aut doloribus\\ndolore doloribus voluptates tempora et\\ndoloremque et quo\\ncum asperiores sit consectetur dolorem\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 52,\n" +
            "    \"title\": \"qui enim et consequuntur quia animi quis voluptate quibusdam\",\n" +
            "    \"body\": \"iusto est quibusdam fuga quas quaerat molestias\\na enim ut sit accusamus enim\\ntemporibus iusto accusantium provident architecto\\nsoluta esse reprehenderit qui laborum\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 53,\n" +
            "    \"title\": \"ut quo aut ducimus alias\",\n" +
            "    \"body\": \"minima harum praesentium eum rerum illo dolore\\nquasi exercitationem rerum nam\\nporro quis neque quo\\nconsequatur minus dolor quidem veritatis sunt non explicabo similique\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 54,\n" +
            "    \"title\": \"sit asperiores ipsam eveniet odio non quia\",\n" +
            "    \"body\": \"totam corporis dignissimos\\nvitae dolorem ut occaecati accusamus\\nex velit deserunt\\net exercitationem vero incidunt corrupti mollitia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 55,\n" +
            "    \"title\": \"sit vel voluptatem et non libero\",\n" +
            "    \"body\": \"debitis excepturi ea perferendis harum libero optio\\neos accusamus cum fuga ut sapiente repudiandae\\net ut incidunt omnis molestiae\\nnihil ut eum odit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 56,\n" +
            "    \"title\": \"qui et at rerum necessitatibus\",\n" +
            "    \"body\": \"aut est omnis dolores\\nneque rerum quod ea rerum velit pariatur beatae excepturi\\net provident voluptas corrupti\\ncorporis harum reprehenderit dolores eligendi\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 57,\n" +
            "    \"title\": \"sed ab est est\",\n" +
            "    \"body\": \"at pariatur consequuntur earum quidem\\nquo est laudantium soluta voluptatem\\nqui ullam et est\\net cum voluptas voluptatum repellat est\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 58,\n" +
            "    \"title\": \"voluptatum itaque dolores nisi et quasi\",\n" +
            "    \"body\": \"veniam voluptatum quae adipisci id\\net id quia eos ad et dolorem\\naliquam quo nisi sunt eos impedit error\\nad similique veniam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 59,\n" +
            "    \"title\": \"qui commodi dolor at maiores et quis id accusantium\",\n" +
            "    \"body\": \"perspiciatis et quam ea autem temporibus non voluptatibus qui\\nbeatae a earum officia nesciunt dolores suscipit voluptas et\\nanimi doloribus cum rerum quas et magni\\net hic ut ut commodi expedita sunt\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 6,\n" +
            "    \"id\": 60,\n" +
            "    \"title\": \"consequatur placeat omnis quisquam quia reprehenderit fugit veritatis facere\",\n" +
            "    \"body\": \"asperiores sunt ab assumenda cumque modi velit\\nqui esse omnis\\nvoluptate et fuga perferendis voluptas\\nillo ratione amet aut et omnis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 61,\n" +
            "    \"title\": \"voluptatem doloribus consectetur est ut ducimus\",\n" +
            "    \"body\": \"ab nemo optio odio\\ndelectus tenetur corporis similique nobis repellendus rerum omnis facilis\\nvero blanditiis debitis in nesciunt doloribus dicta dolores\\nmagnam minus velit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 62,\n" +
            "    \"title\": \"beatae enim quia vel\",\n" +
            "    \"body\": \"enim aspernatur illo distinctio quae praesentium\\nbeatae alias amet delectus qui voluptate distinctio\\nodit sint accusantium autem omnis\\nquo molestiae omnis ea eveniet optio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 63,\n" +
            "    \"title\": \"voluptas blanditiis repellendus animi ducimus error sapiente et suscipit\",\n" +
            "    \"body\": \"enim adipisci aspernatur nemo\\nnumquam omnis facere dolorem dolor ex quis temporibus incidunt\\nab delectus culpa quo reprehenderit blanditiis asperiores\\naccusantium ut quam in voluptatibus voluptas ipsam dicta\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 64,\n" +
            "    \"title\": \"et fugit quas eum in in aperiam quod\",\n" +
            "    \"body\": \"id velit blanditiis\\neum ea voluptatem\\nmolestiae sint occaecati est eos perspiciatis\\nincidunt a error provident eaque aut aut qui\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 65,\n" +
            "    \"title\": \"consequatur id enim sunt et et\",\n" +
            "    \"body\": \"voluptatibus ex esse\\nsint explicabo est aliquid cumque adipisci fuga repellat labore\\nmolestiae corrupti ex saepe at asperiores et perferendis\\nnatus id esse incidunt pariatur\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 66,\n" +
            "    \"title\": \"repudiandae ea animi iusto\",\n" +
            "    \"body\": \"officia veritatis tenetur vero qui itaque\\nsint non ratione\\nsed et ut asperiores iusto eos molestiae nostrum\\nveritatis quibusdam et nemo iusto saepe\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 67,\n" +
            "    \"title\": \"aliquid eos sed fuga est maxime repellendus\",\n" +
            "    \"body\": \"reprehenderit id nostrum\\nvoluptas doloremque pariatur sint et accusantium quia quod aspernatur\\net fugiat amet\\nnon sapiente et consequatur necessitatibus molestiae\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 68,\n" +
            "    \"title\": \"odio quis facere architecto reiciendis optio\",\n" +
            "    \"body\": \"magnam molestiae perferendis quisquam\\nqui cum reiciendis\\nquaerat animi amet hic inventore\\nea quia deleniti quidem saepe porro velit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 69,\n" +
            "    \"title\": \"fugiat quod pariatur odit minima\",\n" +
            "    \"body\": \"officiis error culpa consequatur modi asperiores et\\ndolorum assumenda voluptas et vel qui aut vel rerum\\nvoluptatum quisquam perspiciatis quia rerum consequatur totam quas\\nsequi commodi repudiandae asperiores et saepe a\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 7,\n" +
            "    \"id\": 70,\n" +
            "    \"title\": \"voluptatem laborum magni\",\n" +
            "    \"body\": \"sunt repellendus quae\\nest asperiores aut deleniti esse accusamus repellendus quia aut\\nquia dolorem unde\\neum tempora esse dolore\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 71,\n" +
            "    \"title\": \"et iusto veniam et illum aut fuga\",\n" +
            "    \"body\": \"occaecati a doloribus\\niste saepe consectetur placeat eum voluptate dolorem et\\nqui quo quia voluptas\\nrerum ut id enim velit est perferendis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 72,\n" +
            "    \"title\": \"sint hic doloribus consequatur eos non id\",\n" +
            "    \"body\": \"quam occaecati qui deleniti consectetur\\nconsequatur aut facere quas exercitationem aliquam hic voluptas\\nneque id sunt ut aut accusamus\\nsunt consectetur expedita inventore velit\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 73,\n" +
            "    \"title\": \"consequuntur deleniti eos quia temporibus ab aliquid at\",\n" +
            "    \"body\": \"voluptatem cumque tenetur consequatur expedita ipsum nemo quia explicabo\\naut eum minima consequatur\\ntempore cumque quae est et\\net in consequuntur voluptatem voluptates aut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 74,\n" +
            "    \"title\": \"enim unde ratione doloribus quas enim ut sit sapiente\",\n" +
            "    \"body\": \"odit qui et et necessitatibus sint veniam\\nmollitia amet doloremque molestiae commodi similique magnam et quam\\nblanditiis est itaque\\nquo et tenetur ratione occaecati molestiae tempora\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 75,\n" +
            "    \"title\": \"dignissimos eum dolor ut enim et delectus in\",\n" +
            "    \"body\": \"commodi non non omnis et voluptas sit\\nautem aut nobis magnam et sapiente voluptatem\\net laborum repellat qui delectus facilis temporibus\\nrerum amet et nemo voluptate expedita adipisci error dolorem\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 76,\n" +
            "    \"title\": \"doloremque officiis ad et non perferendis\",\n" +
            "    \"body\": \"ut animi facere\\ntotam iusto tempore\\nmolestiae eum aut et dolorem aperiam\\nquaerat recusandae totam odio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 77,\n" +
            "    \"title\": \"necessitatibus quasi exercitationem odio\",\n" +
            "    \"body\": \"modi ut in nulla repudiandae dolorum nostrum eos\\naut consequatur omnis\\nut incidunt est omnis iste et quam\\nvoluptates sapiente aliquam asperiores nobis amet corrupti repudiandae provident\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 78,\n" +
            "    \"title\": \"quam voluptatibus rerum veritatis\",\n" +
            "    \"body\": \"nobis facilis odit tempore cupiditate quia\\nassumenda doloribus rerum qui ea\\nillum et qui totam\\naut veniam repellendus\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 79,\n" +
            "    \"title\": \"pariatur consequatur quia magnam autem omnis non amet\",\n" +
            "    \"body\": \"libero accusantium et et facere incidunt sit dolorem\\nnon excepturi qui quia sed laudantium\\nquisquam molestiae ducimus est\\nofficiis esse molestiae iste et quos\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 8,\n" +
            "    \"id\": 80,\n" +
            "    \"title\": \"labore in ex et explicabo corporis aut quas\",\n" +
            "    \"body\": \"ex quod dolorem ea eum iure qui provident amet\\nquia qui facere excepturi et repudiandae\\nasperiores molestias provident\\nminus incidunt vero fugit rerum sint sunt excepturi provident\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 81,\n" +
            "    \"title\": \"tempora rem veritatis voluptas quo dolores vero\",\n" +
            "    \"body\": \"facere qui nesciunt est voluptatum voluptatem nisi\\nsequi eligendi necessitatibus ea at rerum itaque\\nharum non ratione velit laboriosam quis consequuntur\\nex officiis minima doloremque voluptas ut aut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 82,\n" +
            "    \"title\": \"laudantium voluptate suscipit sunt enim enim\",\n" +
            "    \"body\": \"ut libero sit aut totam inventore sunt\\nporro sint qui sunt molestiae\\nconsequatur cupiditate qui iste ducimus adipisci\\ndolor enim assumenda soluta laboriosam amet iste delectus hic\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 83,\n" +
            "    \"title\": \"odit et voluptates doloribus alias odio et\",\n" +
            "    \"body\": \"est molestiae facilis quis tempora numquam nihil qui\\nvoluptate sapiente consequatur est qui\\nnecessitatibus autem aut ipsa aperiam modi dolore numquam\\nreprehenderit eius rem quibusdam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 84,\n" +
            "    \"title\": \"optio ipsam molestias necessitatibus occaecati facilis veritatis dolores aut\",\n" +
            "    \"body\": \"sint molestiae magni a et quos\\neaque et quasi\\nut rerum debitis similique veniam\\nrecusandae dignissimos dolor incidunt consequatur odio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 85,\n" +
            "    \"title\": \"dolore veritatis porro provident adipisci blanditiis et sunt\",\n" +
            "    \"body\": \"similique sed nisi voluptas iusto omnis\\nmollitia et quo\\nassumenda suscipit officia magnam sint sed tempora\\nenim provident pariatur praesentium atque animi amet ratione\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 86,\n" +
            "    \"title\": \"placeat quia et porro iste\",\n" +
            "    \"body\": \"quasi excepturi consequatur iste autem temporibus sed molestiae beatae\\net quaerat et esse ut\\nvoluptatem occaecati et vel explicabo autem\\nasperiores pariatur deserunt optio\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 87,\n" +
            "    \"title\": \"nostrum quis quasi placeat\",\n" +
            "    \"body\": \"eos et molestiae\\nnesciunt ut a\\ndolores perspiciatis repellendus repellat aliquid\\nmagnam sint rem ipsum est\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 88,\n" +
            "    \"title\": \"sapiente omnis fugit eos\",\n" +
            "    \"body\": \"consequatur omnis est praesentium\\nducimus non iste\\nneque hic deserunt\\nvoluptatibus veniam cum et rerum sed\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 89,\n" +
            "    \"title\": \"sint soluta et vel magnam aut ut sed qui\",\n" +
            "    \"body\": \"repellat aut aperiam totam temporibus autem et\\narchitecto magnam ut\\nconsequatur qui cupiditate rerum quia soluta dignissimos nihil iure\\ntempore quas est\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 9,\n" +
            "    \"id\": 90,\n" +
            "    \"title\": \"ad iusto omnis odit dolor voluptatibus\",\n" +
            "    \"body\": \"minus omnis soluta quia\\nqui sed adipisci voluptates illum ipsam voluptatem\\neligendi officia ut in\\neos soluta similique molestias praesentium blanditiis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 91,\n" +
            "    \"title\": \"aut amet sed\",\n" +
            "    \"body\": \"libero voluptate eveniet aperiam sed\\nsunt placeat suscipit molestias\\nsimilique fugit nam natus\\nexpedita consequatur consequatur dolores quia eos et placeat\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 92,\n" +
            "    \"title\": \"ratione ex tenetur perferendis\",\n" +
            "    \"body\": \"aut et excepturi dicta laudantium sint rerum nihil\\nlaudantium et at\\na neque minima officia et similique libero et\\ncommodi voluptate qui\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 93,\n" +
            "    \"title\": \"beatae soluta recusandae\",\n" +
            "    \"body\": \"dolorem quibusdam ducimus consequuntur dicta aut quo laboriosam\\nvoluptatem quis enim recusandae ut sed sunt\\nnostrum est odit totam\\nsit error sed sunt eveniet provident qui nulla\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 94,\n" +
            "    \"title\": \"qui qui voluptates illo iste minima\",\n" +
            "    \"body\": \"aspernatur expedita soluta quo ab ut similique\\nexpedita dolores amet\\nsed temporibus distinctio magnam saepe deleniti\\nomnis facilis nam ipsum natus sint similique omnis\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 95,\n" +
            "    \"title\": \"id minus libero illum nam ad officiis\",\n" +
            "    \"body\": \"earum voluptatem facere provident blanditiis velit laboriosam\\npariatur accusamus odio saepe\\ncumque dolor qui a dicta ab doloribus consequatur omnis\\ncorporis cupiditate eaque assumenda ad nesciunt\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 96,\n" +
            "    \"title\": \"quaerat velit veniam amet cupiditate aut numquam ut sequi\",\n" +
            "    \"body\": \"in non odio excepturi sint eum\\nlabore voluptates vitae quia qui et\\ninventore itaque rerum\\nveniam non exercitationem delectus aut\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 97,\n" +
            "    \"title\": \"quas fugiat ut perspiciatis vero provident\",\n" +
            "    \"body\": \"eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 98,\n" +
            "    \"title\": \"laboriosam dolor voluptates\",\n" +
            "    \"body\": \"doloremque ex facilis sit sint culpa\\nsoluta assumenda eligendi non ut eius\\nsequi ducimus vel quasi\\nveritatis est dolores\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 99,\n" +
            "    \"title\": \"temporibus sit alias delectus eligendi possimus magni\",\n" +
            "    \"body\": \"quo deleniti praesentium dicta non quod\\naut est molestias\\nmolestias et officia quis nihil\\nitaque dolorem quia\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"userId\": 10,\n" +
            "    \"id\": 100,\n" +
            "    \"title\": \"at nam consequatur ea labore ea harum\",\n" +
            "    \"body\": \"cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut\"\n" +
            "  }\n" +
            "]";
    private List<Model> arrayListData = new ArrayList<Model>();
    private ListView lsview;
    //private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String title;
        String body;
        int userid;
        int id;
        lsview = (ListView)findViewById(R.id.listview);
        try {
            JSONArray rootArray = new JSONArray(myJSONString);

            for (int i = 0; i < rootArray.length(); i++) {

                JSONObject myobj = rootArray.getJSONObject(i);

                userid = myobj.getInt("userId");
                id = myobj.getInt("id");
                title = myobj.getString("title");
                body = myobj.getString("body");

                Model md = new Model();
                md.setUserid(userid);
                md.setId(id);
                md.setTitle(title);
                md.setBody(body);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
