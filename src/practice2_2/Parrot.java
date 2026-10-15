package practice2_2;

import java.util.List;

//•	Попугай. Имеет текст и умеет петь этот текст. При инициализации обязательно необходимо указать текст, который будет исполняться.
// При пении текст выводится не весь, а первые N символов (не менее одного и не более всех символов текста), где N определяется случайно.
//Вместе с Птицей реализуйте также Воробья, Кукушку и Попугая.
public class Parrot extends Birds{
    private final String text;
    public Parrot(String text) {
        super();
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("У попугая должен быть задан текст");
        }
        this.text = text;
    }

    @Override
    public String sing() {
        String txt = this.text;
        int min = 1;
        int max = txt.length();
        String res;
        int ranCount = (int)(Math.random() * (max - min + 1) + min);
        res = txt.substring(0, ranCount);

        return res;
    }
}
