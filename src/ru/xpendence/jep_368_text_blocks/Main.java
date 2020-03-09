package ru.xpendence.jep_368_text_blocks;

/**
 * JEP 368: Текстовые блоки.
 * Теперь можно вставлять текстовые блоки с сохранением переносов, табуляции и прочего форматировния.
 *
 * @author Вячеслав Чернышов
 * @since 07.03.2020
 */
public class Main {

    public static void main(String[] args) {

        String oldHtml = "<html>\n\t<body>\n\t\t<p>Hi all!</p>\n\t</body>\n</html>";
        System.out.println(oldHtml);

        String html = """
                <html>
                    <body>
                        <p>Hi all!</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        String text = """
                Богами вам ещё даны \
                Златые дни, златые ночи, \
                И томных дев устремлены  \
                На вас внимательные очи. \
                Играйте, пойте, о друзья! \
                Утратьте вечер скоротечный; \
                И вашей радости беспечной \
                Сквозь слёзы улыбнуся я.
                """;
        System.out.println(text);
    }
}
