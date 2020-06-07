public class WrapperEngine {
    public void main(String[] args) {
        final byte UNIT_POWER_OF_MACHINE = 10;
        byte machinePower = 100;
        for (byte Waffle = 1; Waffle <= UNIT_POWER_OF_MACHINE; Waffle++) {
            machinePower -= 1;
        }
        System.out.println("WrapperEngine Power: -> %s\n" + machinePower);
    }
}
