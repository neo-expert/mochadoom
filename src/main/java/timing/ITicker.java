package timing;

import static doom.SourceCode.I_IBM.I_GetTime;

import doom.CVarManager;
import doom.CommandVariable;
import doom.SourceCode.I_IBM;

public interface ITicker {

  static ITicker createTicker(CVarManager CVM) {
    if (CVM.bool(CommandVariable.MILLIS)) {
      return new MilliTicker();
    } else if (CVM.bool(CommandVariable.FASTTIC) || CVM.bool(CommandVariable.FASTDEMO)) {
      return new DelegateTicker();
    } else {
      return new NanoTicker();
    }
  }

  @I_IBM.C(I_GetTime)
  int GetTime();
}