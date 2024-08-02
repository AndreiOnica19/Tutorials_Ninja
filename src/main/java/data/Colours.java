package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Colours {
    COLOUR_BLACK("rgb(54, 54, 54)");

    private final String value;
}

