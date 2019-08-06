package TimbradoMDL.WS;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Web.Services.Protocols.*;
import TimbradoMDL.WS.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class timbrarCFDI extends SoapHttpClientProtocol implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUrl(java.lang.String value) {
    try {
      javonetHandle.set("Url", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUrl() {
    try {
      java.lang.String res = javonetHandle.get("Url");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseDefaultCredentials(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseDefaultCredentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseDefaultCredentials() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseDefaultCredentials");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public timbrarCFDI() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("TimbradoMDL.WS.timbrarCFDI");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "CalltimbrarCFDICompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CalltimbrarCFDICompletedEventHandler handler :
                  _CalltimbrarCFDICompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CalltimbrarCFDICompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public timbrarCFDI(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public respuestaTimbrado CalltimbrarCFDI(
      java.lang.String suscriptorRFC, java.lang.String agenteTI, java.lang.String documentoXML) {
    try {
      Object res = javonetHandle.invoke("CalltimbrarCFDI", suscriptorRFC, agenteTI, documentoXML);
      if (res == null) return null;
      return new respuestaTimbrado((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CalltimbrarCFDIAsync(
      java.lang.String suscriptorRFC, java.lang.String agenteTI, java.lang.String documentoXML) {
    try {
      javonetHandle.invoke("CalltimbrarCFDIAsync", suscriptorRFC, agenteTI, documentoXML);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CalltimbrarCFDIAsync(
      java.lang.String suscriptorRFC,
      java.lang.String agenteTI,
      java.lang.String documentoXML,
      Object userState) {
    try {
      javonetHandle.invoke(
          "CalltimbrarCFDIAsync", suscriptorRFC, agenteTI, documentoXML, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CancelAsync(Object userState) {
    try {
      javonetHandle.invoke("CancelAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<CalltimbrarCFDICompletedEventHandler>
      _CalltimbrarCFDICompletedListeners =
          new java.util.ArrayList<CalltimbrarCFDICompletedEventHandler>();

  public void addCalltimbrarCFDICompleted(CalltimbrarCFDICompletedEventHandler toAdd) {
    _CalltimbrarCFDICompletedListeners.add(toAdd);
  }

  public void removeCalltimbrarCFDICompleted(CalltimbrarCFDICompletedEventHandler toRemove) {
    _CalltimbrarCFDICompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
