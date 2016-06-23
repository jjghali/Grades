package geniets.android.data.soap;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.6.0
//
// Created by Quasar Development at 19/06/2016
//
//---------------------------------------------------


import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class Etudiant extends DonneesRetournees implements KvmSerializable {
    public Long id;

    public String nom;

    public String prenom;

    public String codePerm;

    public String soldeTotal;

    public Boolean masculin = false;

    public String passwordHash;

    public Etudiant() {
    }

    public Etudiant(java.lang.Object paramObj, ExtendedSoapSerializationEnvelope __envelope) {
        super(paramObj, __envelope);
        if (paramObj == null)
            return;
        AttributeContainer inObj = (AttributeContainer) paramObj;


        if (inObj instanceof SoapObject) {
            SoapObject soapObject = (SoapObject) inObj;
            int size = soapObject.getPropertyCount();
            for (int i0 = 0; i0 < size; i0++) {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info = soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue();
                if (info.name.equals("nom")) {
                    if (obj != null) {

                        if (obj.getClass().equals(SoapPrimitive.class)) {
                            SoapPrimitive j = (SoapPrimitive) obj;
                            if (j.toString() != null) {
                                this.nom = j.toString();
                            }
                        } else if (obj instanceof String) {
                            this.nom = (String) obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("prenom")) {
                    if (obj != null) {

                        if (obj.getClass().equals(SoapPrimitive.class)) {
                            SoapPrimitive j = (SoapPrimitive) obj;
                            if (j.toString() != null) {
                                this.prenom = j.toString();
                            }
                        } else if (obj instanceof String) {
                            this.prenom = (String) obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("codePerm")) {
                    if (obj != null) {

                        if (obj.getClass().equals(SoapPrimitive.class)) {
                            SoapPrimitive j = (SoapPrimitive) obj;
                            if (j.toString() != null) {
                                this.codePerm = j.toString();
                            }
                        } else if (obj instanceof String) {
                            this.codePerm = (String) obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("soldeTotal")) {
                    if (obj != null) {

                        if (obj.getClass().equals(SoapPrimitive.class)) {
                            SoapPrimitive j = (SoapPrimitive) obj;
                            if (j.toString() != null) {
                                this.soldeTotal = j.toString();
                            }
                        } else if (obj instanceof String) {
                            this.soldeTotal = (String) obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("masculin")) {
                    if (obj != null) {

                        if (obj.getClass().equals(SoapPrimitive.class)) {
                            SoapPrimitive j = (SoapPrimitive) obj;
                            if (j.toString() != null) {
                                this.masculin = new Boolean(j.toString());
                            }
                        } else if (obj instanceof Boolean) {
                            this.masculin = (Boolean) obj;
                        }
                    }
                    continue;
                }

            }

        }


    }


    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (propertyIndex == count + 0) {
            return this.nom != null ? this.nom : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == count + 1) {
            return this.prenom != null ? this.prenom : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == count + 2) {
            return this.codePerm != null ? this.codePerm : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == count + 3) {
            return this.soldeTotal != null ? this.soldeTotal : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == count + 4) {
            return masculin;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount() + 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        int count = super.getPropertyCount();
        if (propertyIndex == count + 0) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "nom";
            info.namespace = "http://etsmtl.ca/";
        }
        if (propertyIndex == count + 1) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "prenom";
            info.namespace = "http://etsmtl.ca/";
        }
        if (propertyIndex == count + 2) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "codePerm";
            info.namespace = "http://etsmtl.ca/";
        }
        if (propertyIndex == count + 3) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "soldeTotal";
            info.namespace = "http://etsmtl.ca/";
        }
        if (propertyIndex == count + 4) {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "masculin";
            info.namespace = "http://etsmtl.ca/";
        }
        super.getPropertyInfo(propertyIndex, arg1, info);
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
