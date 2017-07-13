package zsp.mytool;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;

public class InputFilterSpace {
    /**
     * 过滤空格
     */
    public static void inputFilterSpace(final EditText edit, int lenth) {
        edit.setFilters(new InputFilter[]{new InputFilter.LengthFilter(lenth),
                new InputFilter() {
                    public CharSequence filter(CharSequence src, int start,
                                               int end, Spanned dst, int dstart, int dend) {
                        if (src.length() < 1) {
                            return null;
                        } else {
                            char temp[] = (src.toString()).toCharArray();
                            char result[] = new char[temp.length];
                            for (int i = 0, j = 0; i < temp.length; i++) {
                                if (temp[i] == ' ') {
                                    continue;
                                } else {
                                    result[j++] = temp[i];
                                }
                            }
                            return String.valueOf(result).trim();
                        }

                    }
                }});
    }

    /**
     * 设置输入框小数输入位数
     */
    public static void setPoint(final EditText editText, final int pointsNum) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().contains(".")) {
                    if (s.length() - 1 - s.toString().indexOf(".") > pointsNum) {
                        s = s.toString().subSequence(0,
                                s.toString().indexOf(".") + pointsNum + 1);
                        editText.setText(s);
                        editText.setSelection(s.length());
                    }
                }
                if (s.toString().trim().substring(0).equals(".")) {
                    s = "0" + s;
                    editText.setText(s);
                    editText.setSelection(2);
                }
                if (s.toString().startsWith("0")
                        && s.toString().trim().length() > 1) {
                    if (!s.toString().substring(1, 2).equals(".")) {
                        editText.setText(s.subSequence(0, 1));
                        editText.setSelection(1);
                        return;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}