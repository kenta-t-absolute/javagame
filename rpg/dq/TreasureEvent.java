/*
 * Created on 2005/11/19
 *
 */

/**
 * @author mori
 *
 */
public class TreasureEvent extends Event {
    // �󔠂ɓ����Ă���A�C�e����
    private String itemName;

    /**
     * @param x X���W
     * @param y Y���W
     * @param itemName ��ɓ���A�C�e����
     */
    public TreasureEvent(int x, int y, String itemName) {
        super(x, y, Chipset.TREASURE, false);
        this.itemName = itemName;
    }

    /**
     * �A�C�e������Ԃ�
     * @return �A�C�e����
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * �C�x���g�𕶎���ɕϊ��i�f�o�b�O�p�j
     */
    public String toString() {
        return "TREASURE:" + super.toString() + ":" + itemName;
    }
}