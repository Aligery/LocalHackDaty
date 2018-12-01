package src.MappingControllers;

import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import src.DTO.*;

@RestController
public class Controller{
    Item coconutOil;
    Item trifinaldi;
    Item muriven;
    Item kunjut;

    Item aban;
    Item amalaki;
    Item ambimap;
    Item arogya;

    Item laimMyata;
    Item tulasiMasala;
    Item kapha;
    Item pitta;

    Item muscul;
    Item paileks;
    Item silvereks;
    Item boroSafe;

    Item tiger;
    Item rukot;
    Item strong;
    Item soft;

    Item lalima;
    Item djoshina;
    Item livomap;
    Item mentat;

    public ArrayList<Item> Items = new ArrayList<Item>();

    public void init()
    {

        coconutOil.setItemType(ItemType.Oil);
        coconutOil.setNAME("Кокосовое масло");
        coconutOil.setInfo("восстанавливает, успокаивает и увлажняет кожу, делает её мягкой и упругой, снимает различные воспаления\n" +
                "убирает мелкие морщинки на коже лица, в отличие от дорогих, содержащих химические элементы кремов, активизирует естественные процессы обновления, а не просто маскирует недостатки;\n" +
                "прекрасно снимает макияж;\n" +
                "способствует заживлению ран, трещин, бытовых и солнечных ожогов, а также укусов насекомых;\n" +
                "может использоваться как средство для загара на пляже и в солярии\n" +
                "беременные могут его использовать для предотвращения образования растяжек\n" +
                "успокаивает и смягчает кожу после таких агрессивных воздействий как бритье, пиллинг и т.д;\n");
        coconutOil.setPrice(200);
        coconutOil.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/coconatoil1.png");

        trifinaldi.setItemType(ItemType.Oil);
        trifinaldi.setNAME("Масло Трифалади");
        trifinaldi.setInfo("Болезни головы\n" +
                "Болезни глаз\n" +
                "Любые паталогии, расположенные выше ключиц\n" +
                "Выпадение волос\n" +
                "Простудные заболевания насморк\n" +
                "Ослабленное зрение\n" +
                "Облысение\n" +
                "Седина\n");
        trifinaldi.setPrice(700);
        trifinaldi.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/murivenna.png");

        muriven.setItemType(ItemType.Oil);
        muriven.setNAME("Масло Муривена");
        muriven.setInfo("Заболевания вата-доши: переломы, ушибы, вывихи, порезы, раны, язвы (включая инфицированные), отёки, нагноения, повреждения связок;\n" +
                "артрит, скованность в суставах. Может использоваться для пропитывания перевязочного материала. Обладает антисептическим и заживляющим действием. Применяется наружно и внутрь\n");
        muriven.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/trifaladitailam.png");
        muriven.setPrice(150);

        kunjut.setItemType(ItemType.Oil);
        kunjut.setNAME("Кунжутное масло холодного отжима\n");
        kunjut.setInfo("Если его принимать в пищу регулярно, то можно защитить себя от таких болезней, как атеросклероз, остеопороз, оно жизненно необходимо при легочных заболеваниях. Кроме того, считается что показаниями к приему будут считаться болезни щитовидной и поджелудочной желез, сердечно-сосудистые заболевания, малокровие, заболевания печени и поджелудочной железы.\n" +
                "Масло нормализует липидный обмен, что очень актуально для людей, страдающих ожирением. Повышенное содержание кальция в кунжутном масле делает его особенно полезным для людей преклонного возраста, детей и беременных.\n" +
                "Кроме того, наружное применение такого масла отлично справится с раздражением, мелкими ранками, солнечными ожогами. Также оно нашло свое широкое применение в косметологии. Из него делают питательные маски для кожи лица, тела и волос.\n" +
                "Единственное, стоит учитывать, что сочетать кунжутное масло с аспирином и продуктами богатыми щавелевой кислотой нельзя.");
        kunjut.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/7.png");
        kunjut.setPrice(450);

        aban.setItemType(ItemType.Bad);
        aban.setNAME("Абана Гималайя (Для Сердца и Сосудов)");
        aban.setInfo("Абана - препарат, оказывающий положительное воздействие на работу сердечно-сосудистой системы. Эффективный кардиопротектор растительного происхождения. Нормализует работу сердца, понижает уровень холестерина и очищает кровеносные сосуды.\n" +
                "При регулярном приеме нормализует кровяное давление, очищает кровь, оказывает благоприятное воздействие на сердечную мышцу. Способствует быстрому расщеплению жиров в организме, давая энергию и поддерживая ее в тонусе.\n");
        aban.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/5sl5zpzulxs-500x500.jpg");
        aban.setPrice(350);

        amalaki.setItemType(ItemType.Bad);
        amalaki.setNAME("Амалаки Гималайя (Омоложение)");
        amalaki.setInfo("Амла («индийский крыжовник») одна из самых эффективных омолаживающих трав, используемых в аюрведе. Амалаки богата витамином С (до 3000 мг в одном плоде), а также различные формы аскорбиновой кислоты, соединенные с таниновым комплексом и галлиевой кислотой. Благодаря целебному составу Амла входит в состав Трифалы и Чаванпраша. Индийский крыжовник обновляет кровь кровь, способствует очищению организма от токсиков и шлаков, регулирует уровень сахара и холестерина, стимулирует иммунную систему, предупреждает появление первых признаков старения.");
        amalaki.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/amalaki-himalaya-500x500.jpg");
        amalaki.setPrice(350);

        ambimap.setItemType(ItemType.Bad);
        ambimap.setNAME("Амбимап Махариши Аюрведа (От Диареи и Отравлений)");
        ambimap.setInfo("Успокаивают и гармонизируют нарушенные доши, что приводит к устранению дизентерии, нормализуют действие пищеварительной системы и противодействуют паразитической инфекции.\n" +
                "\n" +
                "В аюрведе атисар (понос) и правахика (общепринятый термин для дизентерии) считаются взаимосвязанными явлениями. Атисар — такая болезнь, когда стул становится жидкостью. Апи или «джал дхату» уничтожает джатхарагни - огонь пищеварения, после чего активируется нарушенными дошами и выходит в виде жидкого стула. Правахика сходна с этим процессом, когда стул выходит в меньших количествах, смешиваясь со слизью (иногда также с кровью), но с большой частотой. Основной причиной этого является дисбаланс дош Вата и Питта.");
        ambimap.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/ambimap_ambimap_wdadadwa100_tab_maharishi_ayurveda-500x500.png");
        ambimap.setPrice(950);

        arogya.setItemType(ItemType.Bad);
        arogya.setNAME("Арогьявардхини Байдьянатх");
        arogya.setPrice(350);
        arogya.setInfo("Арогьявардхини – это средство, которое помогает при целом ряде заболеваний жизненно важных внутренних органов.\n" +
                "\n" +
                "Это одно из лучших средств для защиты и восстановления печени. Его можно применять как для излечения от болезни, так и для восстановления после нее. Также препарат желательно применять после обильного приема алкоголя, так как он защищает печень от повреждений. Также помогает при желчекаменной болезни и ожирении. \n" +
                "\n" +
                "Средство для лечения кожных болезней и очищения организма. Уравновешивает три доши. Улучшает обмен веществ.\n" +
                "\n" +
                "Значительно улучшает состояние кожи при проблемах с ней различного происхождения. Назначается при лечении печени и селезенки, гепатите, кожных заболеваниях, ожирении, высоком уровне холестерина, синдроме раздраженного кишечника.\n" +
                "\n" +
                "\n" +
                "Активные ингредиенты:\n" +
                "\n" +
                "Парада (Hydrargyrum). Переработанная ртуть. Прошедшая специальную обработку, становится абсолютно безопасной для организма. Повышает сопротивляемость организма к болезням, насыщает его энергией, омолаживает, помогает восстановить пострадавшие ткани организма, стимулирует умственную деятельность, является антисептиком.\n" +
                "\n" +
                "Лоха Бхасма (Ferrum). Специальным образом измельченное и при помощи трав обработанное железо. Благодаря этому оно приобретает целебные свойства и легко усваивается организмом, в отличие от современных минеральных добавок. Помогает при анемии, стабилизирует состояние щитовидной железы, хорошо влияет на состояние кожи, волос, ногтей, костей, восстанавливает иммунитет.\n" +
                "\n" +
                "Абхрак Бхасма (Ciliciolithos). Специальным образом измельченная и при помощи трав обработанная слюда. Помогает избавиться от хронических болезней, в том числе болезней сердца, кашля, анемии, астмы, заболеваний глаз и кишечных болезнях.\n" +
                "\n" +
                "Гандака (Sulphurium). Применяется в аюрведической медицине для лечения кожных болезней, зуде, хронической лихорадке, болезнях мочеполовой системы, диарее, малосорбции, олигоспермии. Омолаживает, улучшает переваривание, улучшает цвет и упругость кожи, повышает иммунитет.\n" +
                "\n" +
                "Тамра Бхасма (Cuprum). Специальным образом обработанная и очищенная зола меди. Помогает при асците, болезнях ЖКТ, диабете, истощении, слабости, нарушениях зрения, судорогах, болезнях кожи, непроходимости кишечника.\n" +
                "\n" +
                "Трифала (Triphala). Лечебный состав из трех лечебных трав (амалаки, харитаки, бибхитаки), очищающий и омолаживающих организм, обладает легким слабительным воздействием.\n" +
                "\n" +
                "Шиладжит (Asphaltum). Замедляет процессы старения, обладает положительным воздействием на огромное количество заболеваний, увеличивает выносливость, позитивно влияет на состояние иммунной системы, восстанавливает после физического напряжения.\n" +
                "\n" +
                "Гуггул/Коммифора (Commiphora mukul). Целебная смола этого растения имеет ярко выраженные целебные свойства, она эффективно очищает и омолаживает организм, выводит токсины и металлы, нормализует обмен веществ, снижает холестерин, стимулирует работу щитовидной железы.\n" +
                "\n" +
                "Читрак (Plumbago zeylanica). В аюрведе используются корни этого растения. Оно помогает при психических расстройствах, болезнях ЖКТ, паразитах, отеках, геморрое.");
        arogya.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/7d751b91facd93cfc721fc792199f40b-500x583-500x500.jpg");

        laimMyata.setItemType(ItemType.Tea);
        laimMyata.setNAME("Аюрведический чай \"Лайм и мята\"");
        laimMyata.setPrice(250);
        laimMyata.setInfo("Положительно влияет на мысли и разум. Тонкие вкусовые нотки в дополнение к легкому освежающему аромату дают ощущение спокойствия и умиротворения как после медитации. Эффективно освежает, придает заряд бодрости и энергии. Улучшает мыслительные процессы, избавляя от стрессов и негативных мыслей. Употребляется как в горячем, так и в холодном виде. При изменении температурного режима совершенно не теряет своих вкусовых качеств.");
        laimMyata.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/limemint.png");

        tulasiMasala.setItemType(ItemType.Tea);
        tulasiMasala.setNAME("Чай \"Туласи масала\"");
        tulasiMasala.setPrice(300);
        tulasiMasala.setInfo("Тбным бальзамом для души и тела. Считается что туласи обладает чистыми, саттвическими свойствами, раскрывает сердце, наделяет энергией любви, очищает сознание, делаем ум сильным, ясным и спокойным.");
        tulasiMasala.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/tulasimasala.png");

        kapha.setItemType(ItemType.Tea);
        kapha.setNAME("Аюрведический чай \"Капха\"");
        kapha.setPrice(300);
        kapha.setInfo("Эффективно очищает организм от шлаков и токсинов, обладает общеукрепляющим действием. Легкий аромат и неповторимый вкус оказывают положительное влияние на дошу Капха, способствуют улучшению настроения и поднимают жизненный тонус. Регулярное употребление чая эффективно для похудения и выведения лишней жидкости из организма.");
        kapha.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/kapha.png");

        pitta.setItemType(ItemType.Tea);
        pitta.setNAME("Аюрведический чай \"Питта\"");
        pitta.setPrice(300);
        pitta.setInfo("Оказывает благотворное влияние на дошу Питта. Является прекрасным освежающим и тонизирующим свойствами, отлично подходит для употребления в жаркую погоду Успокаивает тело и ум. Активно применяется при лечении повышенной возбудимости и раздражительности. Обладает нежным вкусом и приятным легким ароматом, что способствует быстрому успокоению и избавляет от гневного состояния.");
        pitta.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/pitta.png");

        muscul.setItemType(ItemType.Cream);
        muscul.setNAME("Мускул энд Джойнт Раб Гималайя (Обезболивающий крем)");
        muscul.setPrice(190);
        muscul.setInfo("Крем «Muscle and Joint Rub» на основе растительных компонентов обладает выраженным болеутоляющим эффектом. Улучшает местное кровообращение и защищает нервы в зоне поражения, а также ускоряет процесс заживления. Крем произведен в соответствии с аюрведическими принципами и состоит полностью из натуральных трав. Он не имеет никаких побочных эффектов.\n" +
                "\n" +
                "В большинстве случаев облегчает боль сразу после применения.\n" +
                "\n" +
                "Крем быстро купирует боль при прострелах в мышцах и суставах, растяжениях связок и сухожилий, боли в спине, воспалениях, отеках и при усталости мышц. Благодаря богатому натуральному составу крем эффективно согревает мышцы, стимулирует кровообращение, подавляет боль и воспаление прекращается. Средство обладает выраженным анальгетическим действием, уменьшает боль и скованность в суставах, устраняет боли в мышцах, ускоряет рассасывание гематом. Кроме того, крем имеет расслабляющий эффект и может быть использован, чтобы облегчить дискомфорт, связанный с большой нагрузкой на мышцы и суставы позвоночника. Помогает облегчить сильную боль в мышцах и суставах в результате ущемления нерва, переохлаждения и сквозняков.");
        muscul.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/balsami/ixjbkipczwk-500x500.jpg");

        paileks.setItemType(ItemType.Cream);
        paileks.setNAME("Пайлекс Гималайя (От Варикоза)");
        paileks.setPrice(230);
        paileks.setInfo("Мазь для лечения варикоза и геморроя.\n" +
                "\n" +
                "Это комбинированный препарат, содержащий вещества растительного происхождения. Активные вещества, содержащиеся в таблетках, повышают тонус стенок венозных сосудов, уменьшают выраженность отеков, обусловленных венозной недостаточностью, снижают давление в портальной системе (венозной системе печени).\n" +
                "\n" +
                "На натуральной основе, органически чистый, без консервантов. Проверено дерматологами на безопасность. Не тестировалось на животных.\n" +
                "\n" +
                "Желательно использовать совместно с таблетками «Пайлекс Хималая».");
        paileks.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/balsami/702001-101953-2360-500x500.jpg");

        silvereks.setItemType(ItemType.Cream);
        silvereks.setNAME("Гель Сильверекс с Ионами Серебра (Заживляющий)");
        silvereks.setPrice(340);
        silvereks.setInfo("Заживляющий гель Сильверекс помогает эффективно регенерировать кожные покровы после ожогов, бородавок, порезов и ссадин. \n" +
                " \n" +
                "\n" +
                "Ионы серебра могут быстро проникать в клетки мягких тканей человека, при этом клетка не погибает. Серебро убивает системы ферментов бактерий и микроорганизмов, и губят их. Благодаря этому ионы серебра обладают регенерирующим, антисептическими и бактерицидными свойствами. \n" +
                " \n" +
                "\n" +
                "Коллоидным серебром лечатся различные виды ожогов. Его применение также незаменимо при свищах и плохо заживающих гнойных ранах. \n" +
                " \n" +
                "\n" +
                "Применяется в травматологии и хирургии. Гель наносится не-посредственно на открытые раны, порезы и ссадины ис¬пользовать при экземе, раздражениях кожи, прыщах, уку¬сах насекомых, при лечении гнойно-воспалительных заболе¬ваний уменьшает отек, гиперемии, демаркация очага деструкции происходит в ранние сроки. Так же применяется при вяло заживающих ранах и тро-фических язвах, рожистых воспалениях и пролежнях. \n" +
                " \n" +
                "\n" +
                "При ожогах ионы серебра ускоряют регенерацию кожи, снимает воспаление и уменьшают образование рубцовых тканей. При наружном применении ионы серебра совер¬шенно безболезненны, потому что в отличии от антисептических средств они не разрушают клетки мягких тканей. ");
        silvereks.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/balsami/silverex_ionic_20gm-500x500.jpg");

        boroSafe.setItemType(ItemType.Cream);
        boroSafe.setNAME("Боро Сейв Патанджали (Антисептический крем)");
        boroSafe.setPrice(200);
        boroSafe.setInfo("Уже ставшая классической аюрведическая формула антисептического крема Боро Сейф многофункционального назначения в состав, которого входит масло чайного дерева и экстракт из зародышей пшеницы. Крем пригодиться не только в ежедневном уходе за кожей, но и будет полезным помощником в аптечке.\n" +
                "\n" +
                "Крем Boro Safe Patanjali эффективно увлажняет кожу и устраняет шелушение, очищает и восстанавливает кожный покров, является сильным антисептиком, успокаивает воспаления и раздражение на коже.\n" +
                "\n" +
                "Боро Сейф Патанджали обладает антисептическим, антимикробным и антивоспалительным действием, уменьшает время заживления ран, повреждений и воспаления кожного покрова, оказывает защитный эффект от воздействия внешних неблагоприятных факторов. \n" +
                "\n" +
                "Лечебные свойства крема Боро Сейф:\n" +
                "устраняет зуд от укуса насекомых;\n" +
                "успокаивает жжение кожи;\n" +
                "устраняет раздражения на коже;\n" +
                "ускоряет процесс заживления ран, порезов и трещин на коже;\n" +
                "применяется для заживления ожогов.");
        boroSafe.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/balsami/qvy5pttfgig-500x500.jpg");

        tiger.setItemType(ItemType.Balm);
        tiger.setNAME("Бальам \"Тигр\"");
        tiger.setPrice(400);
        tiger.setInfo("Он мгновенно впитывается и проникает глубоко к перенапряженным и травмированным тканями. За короткое время восстанавливает ушибленные, потянутые связки и мышцы, так как обладает сильным заживляющим и рассасывающим эффектом.\n" +
                "Его действие можно сравнить с действием знаменитого бальзама “Звездочка”, но благодаря входящим в состав корице, ментолу и маслу гвоздики, он обладает более долгим и мощным эффектом. Это способствует более быстрому избавлению от болевого синдрома различного характера, зуда после укусов насекомых, а также эффективной помощи при заложенности носа во время простуды.");
        tiger.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/tigerbeliy-copy1234.png");

        rukot.setItemType(ItemType.Balm);
        rukot.setNAME("Обезболивающий бальзам \"Рукот Лиминент\"");
        rukot.setPrice(350);
        rukot.setInfo("Новая мощная комбинация аюрведического средства от боли: \n" +
                "Бальзам облегчает болезненные ощущения и снимает воспалительный процесс с надкостницы, обладает противоотечным действием.\n" +
                "Он быстро устраняет сильную боль в суставах, действуя по трем направлениям: значительно быстрее других аналогичных препаратов глубоко проникает в поврежденный сустав, эффективно и быстро снимает болевые ощущения, устраняет воспалительный процесс в суставах");
        rukot.setUrlImage("https://ayurvedadom.com/sites/default/files/imagecache/product_full/rukot.png");

        strong.setItemType(ItemType.Balm);
        strong.setNAME("УСПОКАИВАЮЩИЙ И РАССЛАБЛЯЮЩИЙ МАССАЖНЫЙ БАЛЬЗАМ СТРОНГ");
        strong.setPrice(300);
        strong.setInfo("Уникальная аюрведическая формула из экстрактов и масел целебных трав. Название «стронг» в  переводе означает «сильный». При нанесении бальзама на проблемные зоны и леком массаже биологически активных точек,  кровь начинает «сильно» циркулировать в кровеносных сосудах. Активизируется кровообращение, расщепляются скопившиеся вредные вещества, выводятся токсины и, таким образом проходит боль и многие другие недуги. Эфирные травяные масла глубоко проникают в ткани и быстро снимают суставные и мышечные боли, устраняют отек и воспаление, стимулируют восстановление хрящевой ткани сустава, а также оказывают ароматерапевтическое действие, успокаивают, снимают чувство усталости и тонизируют. \n" +
                "Показания к применению:\n" +
                "воспалительные и дегенеративно-дистрофические процессы в суставах;\n" +
                "головная боль;\n" +
                "головокружение;\n" +
                "насморк;\n" +
                "респираторные заболевания.");
        strong.setUrlImage("https://www.ayurveda-shop.ru/published/publicdata/AYURVE38SHOP/attachments/SC/products_pictures/balzam_strong.jpg");

        soft.setItemType(ItemType.Balm);
        soft.setNAME("ПИТАТЕЛЬНЫЙ БАЛЬЗАМ СОФТ ДЛЯ СУХОЙ И ПОТРЕСКАВШЕЙСЯ КОЖИ");
        soft.setPrice(300);
        soft.setInfo("Натуральное аюрведичское средство для естественного устранения сухости и заживления трещин кожных покровов. Каждое, из входящих в состав, растение уникально само по себе и оказывает на кожу благоприятное воздействие. Куркума, Ним, Гималайский Кедр – прекрасные натуральные антисептики. Алое Вера и Жасмин увлажняют и сохраняют влагу в коже. В сочетании все компоненты усиливают и дополняют действие друг друга.\n" +
                "Показания к применению:\n" +
                "обветренные губы, трещины на губах\n" +
                "трещины на ладонях и стопах\n" +
                "загрубевшая кожа на локтях\n" +
                "сухая, потрескавшаяся кожа на пятках\n" +
                "воспаления, ссадины, царапины на коже");
        soft.setUrlImage("https://www.ayurveda-shop.ru/published/publicdata/AYURVE38SHOP/attachments/SC/products_pictures/%D0%91%D0%B0%D0%BB%D1%8C%D0%B7%D0%B0%D0%BC%20%D0%A1%D0%9E%D0%A4%D0%A2.jpg");

        lalima.setItemType(ItemType.Water);
        lalima.setNAME("Сироп Лалима Занду / Syrup Lalima Zandu - 100 гр (Очищение Кожи)");
        lalima.setPrice(290);
        lalima.setInfo("Lalima (Ракташодак) от Zandu является 100% аюрведическим очистительным тоником крови и кожи. Выводит токсины из крови, которые являются причиной прыщей и тусклой кожи. Регулярное потребление Lalima положительно влияет на устранение коренных причин т.е. загрезнения крови, придаст вашей кожи чистоту и здоровье.\n" +
                "\n" +
                "Показания: экзема, нарывы, фурункулы, пищевая аллергия, кожные высыпания, акнэ, токсические состояния крови, глисты, лихорадка, интоксикация печени, дерматит, состояния, связанные с повышенной Питтой, некоторые разновидности рака, пищевые и алкогольные отравления, герпес.");
        lalima.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/sirup/30_lalima-522x600-400x350.png");

        djoshina.setItemType(ItemType.Water);
        djoshina.setNAME("Сироп Джошина Хамдард / Syrup Joshina Hamdard");
        djoshina.setPrice(300);
        djoshina.setInfo("Джошина (Joshina) — Эффективное средство от кашля для детей и взрослых. Применяется для лечения бронхита, воспаления лёгких, любых болезней бронхо-легочной системы.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Сироп \"Джошина\" быстро и эффективно помогает при острых и хронических заболеваниях бронхо-легочной системы. Сироп \"Джошина\" является противокашлевым сиропом, с яркими антиспазмолитическим, антикатарным, антигистаминным, отхаркивающим, антисептическим, противоотечным свойствами. Это хорошее потогонное и жаропонижающее средство при гриппе, большинстве простудных и легочных заболеваний — в частности астмы и бронхита. \"Джошина\" удаляет излишнюю слизь из легких и носовых ходов, снимает раздражение в дыхательном тракте, обеспечивает хорошее выделение бронхолегочной слизи, обладает хорошей антисептической активностью, поэтому может применяться как отдельно, так и совместно с другими антибактериальными средствами для уменьшения кашля при бронхитах. Мягкое действие трав, входящих в состав сиропа направлено на профилактику и избавление от хронических заболеваний легких, синусита, ларингита и пневмонии. \"Джошина\" уменьшает отек слизистой оболочки дыхательных путей, облегчает дыхание, нормализует психофизические реакции, устраняет беспокойство, дискомфорт при бронхоспазме, снимает раздражение и обладает мягким послабляющим эффектом в отношении системы пищеварения. ");
        djoshina.setUrlImage("http://balarama.ru/image/cache/catalog/tovary/sirup/00000168500-400x350.jpg");

        livomap.setItemType(ItemType.Water);
        livomap.setNAME("Сироп Ливомап Махариши Аюрведа / Syrup Livomap");
        livomap.setPrice(280);
        livomap.setInfo("Сироп «Ливомап» от «Махариши Аюрведа» – средство для лечения печени, которое зарекомендовало себя как одно из лучших. Даже если Ваша печень здорова, не спешите решать, что этот препарат не для Вас. Ведь даже здоровая печень испытывает колоссальную нагрузку и нуждается в периодическом очищении и восстановлении. Это обеспечивает хорошую жизнедеятельность всего организма.\n" +
                "\n" +
                "Если Вы страдаете от одной из следующих болезней, то сироп «Ливомап» Вам просто необходим: цирроз печени, амебная дизентерия, кишечные инфекции и паразиты, заболевания желудочно-кишечного тракта, желтуха, инфекционный гепатит и анорексия. Кроме того, «Ливомап» используют как вспомогательное средство при диабете и ослабленной всасывающей способности желудка. Средство превосходно укрепляет кроветворные органы, благодаря чему повышается способность организма самоочищаться. А это значит, что Ваше здоровье будет надежно защищено.\n");
        livomap.setUrlImage("http://vedamarket.com.ua/upload/products/94/main_image/2b874512dcfcd62ac818d3cb695969a6_big.JPG");

        mentat.setItemType(ItemType.Water);
        mentat.setNAME("Сироп Ментат Гималайя / Syrup Mentat Himalaya");
        mentat.setPrice(590);
        mentat.setInfo("\"Ментат\" эффективно улучшает умственные функции и память, восстанавливает способность концентрации внимания, снижает напряжение и повышает стрессоустойчивость. Средство избавляет от беспокойства и тревожных состояний, исправляет дефекты речи, улучшает артикуляцию, стабилизирует деятельность ЦНС.\n" +
                "\n" +
                "Рекомендуется при нарушениях памяти и концентрации внимания, потере или снижении способностей к обучению. Применяется при алкоголизме, гиперкинетических состояниях, необщительном или асоциальном поведении, проявлениях агрессии, энурезе, стрессах.\n" +
                "\n" +
                "Может использоваться как вспомогательное средство при эпилепсии, болезнях Паркинсона и Альцгеймера.\n");
        mentat.setUrlImage("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUTEBAQEBUSEhEOEBAQEBAWFRAQFRIWFhUVFRUYHSogGRolGxUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGislHR8tLS0tLS0rLS0tLS0tLS0tLS0tLS0tKy0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIAOEA4QMBEQACEQEDEQH/xAAcAAEAAgIDAQAAAAAAAAAAAAAABAUGBwECAwj/xABFEAACAQMBBAYECggFBQEAAAAAAQIDBBEhBQYSMQcTQVFhcTKBobEiIzM0QlJygpHBFCRDU3OS0eE1YqKy8BZjg5OjFf/EABkBAQADAQEAAAAAAAAAAAAAAAABAgMEBf/EADURAQACAQIDBgMHAwUBAAAAAAABAgMRMQQSIQUTFDJBUWGRoQYVIjNCgeFSccFTsdHw8UP/2gAMAwEAAhEDEQA/AN4gAAAAAAAAAAABHvLynSg51JKEV2thW1orGsqWpvhbL0XKflF4/EnRl4ijzjvhSb0hJ+tE6J7+rl730u2EvxRGie9hzDfG2+k5LxaGivf19V3Y3tOtHjpTU496ZDWtotGsJIWAAAAAAAAAAAAAAAAAAAAAAAAABgXTHw/oGZTcMVIuKX05a6Ew5uKjWjTNrfzXKrU/nkbRDxrTaFhS2hV/eTf3mW5YZ97Yq31T60162OWE89kC4vKn7yf8zImIWrMzu230JPNrVfFKT63VPOI8+RjZ7PCeRscq6gAAAAAAAAAAAAAAAAAAAAAAAAAYH0wU6bsfjFn4yPBiWGn3rvJjdhxExFOrTVja0+JRcnh5T5Lh5Yee3tNY1eXaMczuyKz2XBSXDWisxlLifA9U0ktV4+wnmn2VrhpE+ZzcWScnGpcxjFU5T48Q1kmkopJLPN/gI19k2x1m2lrdNFDdW1FJtV5TaxhKnwp6rOXl9mROqK1x12nVt/ofrU3ZuMJJuNR5jjWOeWe8xtu9Xhpjk0hnhDoAAAAByAAAAAAAAAAAAAAAAAAAADXHTVZTna05QjKXV1G5cKbwmlq/wLVcvFVma9GnLZm0PGyLS0rRj6UeL1pfky06qUmsbu11cp8oxj/zyEdC0xOyoua2CtpaY6atudB9nONGvUnGUVOcVHiTWUlzRjZ7HC05YbOKuoAAAABAcgAAAAAAAAAAAAAAAAAABh3SntWVtYynFZ45KlJeEkymSZ06NsMRNur5ytFPPwZPHYtDLvLR6r24bDfrNU3FXOFKK+1gtGe8erKezsE/pd61OqlrOL8sEd/f3RHZuCP0qyupfSm8dqSQ57S1pwuGu1X0b0UbYd1Yxk48KhJ0orwjpr+BfHrp1VzxWLfhZmaMQAAAAEByAAAAAAAAAAAAAAAAAAAGtenesls+Me2VaKXq5lLtsO8tJ7NwYWddXte8ysLOYr4IFddRNIUlvDoDrp2VSHbGq8rzbZpSXNn9GzzRgAAAAAgOQAAAAAAAAAAAAAAAAABwBoHps3hVzcxt6T4oW3ptcnVkk2vUmjGbay66Y5rXrvLCNnR5Gdm0MusN0nXjxcbj5LJWOqZto73m6M6cdJZS1bax7xKYtqxO8tOfgTEomGe9De1o29aVKTxGtiOXyU86E1vy267Spkx81Om8N5pnU4AAAAAcgAAAAAAAAAAAAAAAAADpOaSy3hLVvuQI6tab6b/JuVtYy4pPMZ1YvMYLk9Uct8k26Rs7MWGK9bbtZ7VtIQpty1fNyfOTfNspDf8AuprOLLSQuLXaNWn6FScfJlNU6PS42pWmsSqza8ZE6z6o0iNldVbCXna3LhLiTw1r+BMxrBE6S3LuTv3CcY068uxJTyvaTjyzXpZjm4eLfio2LCaaymmnqmu069XDpo5AAAOQAAAAAAAAAAAAAAAADhgaR6Xt+5Oq7K2m4xhpXnF85dsc+BnfrDow19WK7DcIw4n26nJaertiqq23tPrZcMfRi9PFl6x6oktloRK0QlxITyuQaPGqyUaIE5akq6PW2vHB5i8eHYRMarw3D0X76da1bVpa/s2+/wCqXw2ms8s7ObicWv44bQTOpwgADkAAAAAAAAAAAAAAAAAq95dpq1ta1d/sqcqi80tCJTEay+Q6lw5Nzm3KUnxSk+bk+bM9HXE6Jv8A+i+HhXdgz7vrq1711pPJMwROq0t1J8ot+opMNNVpS2dXfKjN/dZXRHM7y2ZXXOjUX3WOU51fd0px9KLXmmTonmVdaZeIVmyJOuW5YUm+iTsvacqVSE4vDjJST8mRaiYya7vrDYF+ri3o1lr1tKnU9copv2m1Z1iHBevLaYWBZUAAAAAAAAAAAAAAAAAAGD9M1fg2Rc+Kpw/mqRj+ZErUjWXy8irZ7UyFoWVlgpZvVlWxdoxptNpaGUrTGrOLbfmikl7ky8XZTi1c1t9qb9HL88kTdMY2I7xbfjWTSikV3lpEMJuqmppEKzKBUkaMpl5ZCur6j6Iqrlsq2z2QcfUm0i1dmWbzMzLMgAAAAAAAAAAAAAAAAAAYd0qWarbPnTkm1KdPKT10mnn2GOabRXWu7o4WtLZYrfZ893e59aOtKSqruekjnrxuOfN0d+Ts/JXadYV09mVoenSnH1Z9xvGWltpc84r13h7W9Nrsa80yJnVeITaOcFJWelObyNB6QqPXUjQQ7nPiXgVlaLNIY2ecbWpL0YTl5RYm9Y3lTktO0LC03YuJayj1S75c/wAEYW4rHG06ujHwWW/po+kui+16rZ1GCy+FNZfbqzfDabV1lycVXkyzX2ZYaucAAAAAAAAAAAAAAAAAOAKHfKWKC/iQX+pBW09GLvY1Gpq48L74PHs5GOXhcWTrMOzDx+fF0idY+I91vqVc+E4p+1HBfsv+iz0Kdr6+enyeU90pdtOhP1L+hzz2fxVfLb6r+P4a28afs8nuh320H5YK+H42P/U+I4SXlPc2L52ifr/uOTjY9P8AY73hfd0juZBcrT/U/wCpHLxs+k/RPecL7w5/6OT5WsfW1/Udzx0p77hI9XZbmvsoUI+LS/oaRwXFz5p+qPG8JXaPo9Y7qSXOcILuhE2p2bf9dmdu1cceSn+HSvsSnTTfwqjSyuN6exHZj4LHT4uLP2nmvGkaQzrdD5rDRLR6Llz7DqcETM9Z3XQSAAAAAAAAAAAAAAAAAACh3x+QX24e9BWyls2WIW1AhZXQ25NSuIypJdS4qjmeHXzFN9mmG8FLZKV80opTNfXlprpsu7Kt1kIy4eHiWWs5w+1ZwWraLRrCZras6W3SCUOk6kY4UpJOTxHL9J9y8SUTMRuSiQlDvFPHwHFPKzxfVzqEW19EesSlT7Sb4Xjn2aZCJZPuomraGeeuc9+SqYXASAAAAAAAAAAAAAAAAAACh3x+Q+/D3oK2UtnyLELWgQspLnZlZ/pEuFOSw7bE18PKWeJNaa+JyzwmO1tbTLotx2etJrSI6bI9G2veJRzUpxc4ZcHH4MepXFj752V5axpDybRxFrazM9f+HpTqXtNQlJ1qvFGupwxFcPDKKpvPe02/UW/CpE566TOs7/wj4u5ODnTq1FTrqrTysPh6mpnV4+lhE/hVjvZmJmNp/wAS8nC/lGpKDrQaUJ0ozx6Tnwzj2cotv1FZmsSvEZra6apFps+5jdQk+JU4ScZSdRPrIcL1xnnnHYikzDelMkXifRkNwS6FPfp4eHh9jfYESyjdhfq0Nc6PXv1KpjZbBIAAAAAAAAAAAAAAAAAAKDfJ4oa/Xh70FbKOhUjCPFOSjFc5SaSS8y5r6re1mpLMZKS74tNewqmJiUlUfNeTHQ0esKXi+0dDrHq7uHq/r3jSE9Tgeuv9hpB1dHT8f+YGkI1n3eEqPbl+wdD90a4Xfp4kkqLa7+LfJp9ur9wUtsyvdP5rT8vzKrxsuAkAAAAAAAAAAAAAAAAAOAMf32+bP7UezPauwKX2YTt//Dqv8J8i8Msn5ctZ2F/Vp46urOPlJmkRDx5yWrPSWRWW997DlXlL7WpaMcK+Ny19Vxb793q5ypy84f3J7qp955o9lhS36un9Ck/UyJxVXr2nmn0h0q7/AN0voUvaT3VUfeuWN4hBuOkG77OqX3SO6hP3nln2VV3vxfS067h+zHH5kd3ELeOyyx3aW2bip8pXqS85MjSExmvbeW0rGC/Q6PFn5GnnHP0UYvXjyQzrdfH6NTwsLh0XciGldlqEgAAAAAAAAAAAAAAAABwBj2/D/Vvvw96Cl9mFbxf4fW5/J9paGV/y5aqoG0PEusKBpDlum0SzGVnQ5FZb49ka7ZaGWTdXVCSEOqZy3qg3BSXTRuOzgnaUk3hdVT1+6jCHu18sM53aS/RqePq6eQleFoQkAAAAAAAAAAAAAAAAAAGPb7/N/vx5eaCltmD7w/4dV5fJ9haGd/y5avsaTnJRgnKUmkkubfcbQ8S1ZmdIW9TZ1anLgqUpxljPC4vOO8tWYYZMV4nSY6uYwaeHleDLxLmvWYnSUyk8EkTo868SVZ3QqkSJaQ8qNnOrLgpwc5PlGKyylpdGOs2nSETaNk4U4zclmTlHg7Y47zOXVWumjblvH9VpLHF8VT0+6jGHtR5YZvu783p5+qQvCzCQAAAAAAAAAAAAAAAAAAY9vqv1fHfOK9qCttmEbyprZ1XP7vGpaGWT8uWvN1PnVD+LH3ms7PJx/mQ3TU4HUVy8cVN1LXHj1jS93tM/g9WYrNued46Kjae7cLi6rVKjko0404qNPCcpYzzfmi9bzEOTNwdc2W1rbR7Ii3NpurGKqzUJ05TxmPFCUcaN45a+wv3s6Ob7tpzxEWnSY/d2o7uWsXRqqdWadfqmpcLUprOMrHLMSJvPVenBYa8t4md9HXaOybete1F1UmqUOKok1GnnGmcLRFYtPK0yYMd889No/ZO2fs23oXFKVGlFOtSqPKbaTis/Bz3lddYdFMdKXiaxvDUu88pdfV46cab4pZhFYUfUXjZw3/Mltekv1ekuLh+LprK+ytDLR68bQzjd75vT+yVXhYhIAAAAAAAAAAAAAAAAAAKDfP5D78PegrZg+9nzCt9gtDPL5Jats6soSUotxlF5jJdjNnhzMx1hkVrvBcv4PWuXFUVZqSjrU5ZzgnlhHiMu2vrqvLbeK762c5QhU61OFSk4rhlwaN47HqOSq8cVmi8zprr6JFLeWuqiqRoU4qNOSjCMcJQbWXnm+SJ5I0RHG5YvzRWNNNkSpt+u6cIQhHEK/Xxklrx/CeNezVjkhWOLy2rFYjadXarvReOTnGNKOYPiXBBqUe955leSumjbxeeZ10jZQ7S3gupSi5VnxUs8DioLhz3YRPLDKc+WZiZlju0Ksp8U5uUnLLcpZy35kSvWZmdZbnpL4mn/AA4f7UYw9yNmZ7vfN6f2Sq0LIJAAAAAAAAAAAAAAAAADhgY/vs2rdYWfjIafeQUtswfemWdn1ms6x7eZaGeWdaS1nZXUoZS4WnriUU/ebPFm0wsaN1F+lRp+cXOL/wBxaIZTkj1hPoXFP6tWPP0avf5otpLKclNdp+aQq9P/AL3Lh+Ujy549Enqpz0+Pz/h4yuKa0Sq6PKxUS7PsiYlNb449/n/CNVuIdlOT+1Ub92COWWkZae0/NEqXuPRp0o+PDKT/ANTaKzDSMntCs2hcymmpSyllpJJL8EUlvW0zPVt7aGlr/wCGP+0x9Hs28rNN0V+p0P4UPcQvXaFwFgAAAAAAAAAAAAAAAAAAY1v3XULbily6ymm+7MkslbWisayvjxWy25a7sL3skns+q0004rVPmaR12c+aJisxMNWUTaHhXTaJpDmsmUyznskRCrpUJEaoQ1qiVSkt6oFy9H5GdtnVj3bqvaeaEVolwRTb5YwY+j3NNY0hmm7bX6NS4eXVxSx3YKxMTs0ms1nln0WZKAAAAAAAAAAAAAAAAAAAYL0zVpQ2XVnHnGdBr/3QK3rFo0ltgvNLxaGoNm700qtN0qrlSUlwyi3mD8U+w862PPi6451h69svD8TGmWukp1PYdKetKqn5NP3ER2pkp0yVcGb7P4MnXFfT6u//AE/VXJwfra/I6adsYZ80TH/f7vLzfZniI8lqz84/w7rY9ZfRT8mjpr2pw0+v0efk+zvHR+mJ/tLstnV/3b9n9TXx/D/1uaexOOj/AOc/R1ns6t+7fsHj+G/rI7E47/Tn6PKWyKz+hj1ozt2nw0fq+jop2Dx0/o+sOj2BWf1F5t/kjC3a3DxtrLvxfZri5801j9/4dZbtpL42qkvDT2s5bdqzbpSr1MP2drTrlv8AJ7bf3yio8HWdY0lFQp+iuzViviM3m6Q9GLcNw/Skaz8269xajls+1k+crelNpf5oJ/md2OOWsQ8fPOuS0/FfGjIAAAAAAAAAAAAAAAAAAGG9L1Dj2TdLuhGf8s1L8iJWpu+XIoo6Um2ryi8xlKPk2VtWJ3aUtMbSv9n7fuY/tZPwepy34XFberqrnyR6r223muO1wfi4/wBznng8TSOKyJ0d6K31YP8AEjwdPinxV3Se9Vb6kPaPB095PFX+CFcb01+xQXqJjgsXrqjxeRSX281y9Ot4fspI3pwmGPRnbiss+qhur2pP06k5ecjqrStdoctslrbyiwWvrLyzjd9dblUuGwtI91rbr/5RL12c+WfxyuyVAAAAAAAAAAAAAAAAAAAV28Nh+kW1aj+8pzp+trCInZNZ0l8h3FrKnJxkmpRfDJNaprmZxOrsmHWKIlMQn2hSWq3t2ZylKTIS85sCHcMtCFRdM0hSUORoylY7sbKldXVKjFN8c4p47I51YR8X13a0VCEYLlCMYLySSXuNHJM6y9gAAAAAAAAAAAAAAAAAAA4YGnOlbo+lKcru1hxZ+FWpxWue2SRjasx1h04skeWWnp27TafY8PwK8zoiEm3plZlZZUTNL3Ugl1kwItctCFTcR1NIUlF6vLxzzyXay+rPlb36GNyJW8Xd3EHGpNYpRktYQ733Nlqx6yxzX/TDa6Rdg5AAAAAAAAAAAAAAAAAAADgABQbZ3Osrpt1reDk+c4rhl+KKTSJXjJaNpYredENs9aNWpT8HiS9pScMe7WOItG8Kut0SVV6FxBrxjgpOGfSWscTX1hFn0WXfZOk/X/cjubJ8TR1XRXePnOkvX/cnurI8RRIp9EFaXp3NOPlFsnup90TxNfZPtOhi3zmtXqz/AMscRX4rUvGL4s54ifSGY7B3KsbPWhbwUl+0l8KX4svFYhlbJa28siLKAAAAAAAAAAAAAAAAAAAAAOAAAAAAAEByAAAAAAAAAAAAAAAA/9k=");


        Items.add(coconutOil);
        Items.add(trifinaldi);
        Items.add(muriven);
        Items.add(kunjut);
        Items.add(aban);
        Items.add(amalaki);
        Items.add(ambimap);
        Items.add(arogya);
        Items.add(laimMyata);
        Items.add(tulasiMasala);
        Items.add(kapha);
        Items.add(pitta);
        Items.add(muscul);
        Items.add(paileks);
        Items.add(silvereks);
        Items.add(boroSafe);
        Items.add(tiger);
        Items.add(rukot);
        Items.add(soft);
        Items.add(strong);
        Items.add(lalima);
        Items.add(djoshina);
        Items.add(livomap);
        Items.add(mentat);
    }
    @RequestMapping(value = "/listOfProducts", method = RequestMethod.GET)
    public ListOfProducts list()
    {
        return new ListOfProducts();
    }
}
