jest.unmock("../app/sum");

describe('sum', () => {
    it('adds 1+2 to equal 3', () => {
        var sum = require('../app/sum');
        expect(sum(1,2)).toBe(3);
    });
});