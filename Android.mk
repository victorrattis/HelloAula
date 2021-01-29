LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

# O nome do module, com este nome você pode adicionar em algum makefile para 
# adiciona-lo em uma arvore de compilação de algum produto.
LOCAL_PACKAGE_NAME := HelloApp

LOCAL_MODULE_TAGS := optional

# Referencia os arquivo de codigo do projeto, nesse caso, ele vai pegar todos
# os arquivos java dentro de src/.
LOCAL_SRC_FILES := $(call all-java-files-under, src)

# Caso queria que o modulo seja compilado via Android SDK.
# LOCAL_SDK_VERSION := current

# Especifica o certificado que irá assinar o APK depois de compilado. Alguns
# valores:
# 	- platform, o Apk irá ser assinado com a mesma assinatura que a plataforma
#	(Android SO);
# 	- PRESIGNED, Não irá assinar o APK por que ele já está assinado.
LOCAL_CERTIFICATE := platform

# Quando true, o app vai ter privilegio de sistema e ele vai ser instalado em
# priv-app/. E false, um app normal e é instaldo em apps/
LOCAL_PRIVILEGED_MODULE := true

include $(BUILD_PACKAGE)
