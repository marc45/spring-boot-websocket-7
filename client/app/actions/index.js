export function selectOption(option) {
    return {
        type: "OPTION_SELECTED",
        payLoad: option
    }
};

export function nextQuestion() {
    return {
        type: "NEXT_SELECTED"
    }
};